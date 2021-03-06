/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob.deobfuscators;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.AConstNull;
import net.runelite.asm.attributes.code.instructions.IAdd;
import net.runelite.asm.attributes.code.instructions.IMul;
import net.runelite.asm.attributes.code.instructions.IfACmpEq;
import net.runelite.asm.attributes.code.instructions.IfACmpNe;
import net.runelite.asm.attributes.code.instructions.IfICmpEq;
import net.runelite.asm.attributes.code.instructions.IfICmpNe;
import net.runelite.asm.execution.Execution;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.MethodContext;
import net.runelite.asm.execution.StackContext;
import net.runelite.deob.Deobfuscator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExprArgOrder implements Deobfuscator
{
	private static final Logger logger = LoggerFactory.getLogger(ExprArgOrder.class);

	private Set<Instruction> swap = new HashSet<>();
	private int count;

	private void visit(InstructionContext ctx)
	{
		Instruction ins = ctx.getInstruction();

		if (ins instanceof IfICmpEq || ins instanceof IfICmpNe
			|| ins instanceof IAdd || ins instanceof IMul)
		{
			StackContext one = ctx.getPops().get(0),
				two = ctx.getPops().get(1);

			if (!(one.getPushed().getInstruction() instanceof PushConstantInstruction)
				&& (two.getPushed().getInstruction() instanceof PushConstantInstruction))
			{
				swap.add(ins);
			}
		}

		if (ins instanceof IfACmpEq || ins instanceof IfACmpNe)
		{
			StackContext one = ctx.getPops().get(0),
				two = ctx.getPops().get(1);

			if (!(one.getPushed().getInstruction() instanceof AConstNull)
				&& (two.getPushed().getInstruction() instanceof AConstNull))
			{
				swap.add(ins);
			}
		}
	}

	private boolean alwaysPopsFromSameInstructions(MethodContext mctx, Instruction i)
	{
		Collection<InstructionContext> instructonContexts = mctx.getInstructonContexts(i);
		InstructionContext ictx = instructonContexts.iterator().next();

		for (InstructionContext i2 : instructonContexts)
		{
			if (!i2.equals(ictx))
			{
				// this instruction doesn't always pop the same thing
				return false;
			}
		}

		return true;
	}

	private void visit(MethodContext ctx)
	{
		for (Instruction i : swap)
		{
			if (!alwaysPopsFromSameInstructions(ctx, i))
			{
				continue;
			}

			InstructionContext ictx = ctx.getInstructonContexts(i).iterator().next();

			StackContext one = ictx.getPops().get(0),
				two = ictx.getPops().get(1);

			Instruction i1 = one.getPushed().getInstruction(),
				i2 = two.getPushed().getInstruction();

			Instructions ins = i.getInstructions();

			if (i1.getInstructions() == null || i2.getInstructions() == null)
			{
				continue;
			}

			assert i1.getInstructions() == ins;
			assert i2.getInstructions() == ins;

			assert ins.getInstructions().contains(i1);
			assert ins.getInstructions().contains(i2);

			assert two.getPushed().getPops().isEmpty();
			ins.remove(i2);

			// Insert right before i.
			// Don't insert after i2, since it is not guarenteed
			// i will pop that.
			int idx = ins.getInstructions().indexOf(i);
			assert idx != -1;

			ins.getInstructions().add(idx, i2);
			i2.setInstructions(ins);

			++count;
		}
		swap.clear();
	}

	@Override
	public void run(ClassGroup group)
	{
		Execution execution = new Execution(group);
		execution.addExecutionVisitor(i -> visit(i));
		execution.addMethodContextVisitor(i -> visit(i));
		execution.populateInitialMethods();
		execution.run();

		logger.info("Reordered {} expressions", count);
	}
}
