import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Region")
public class Region {
   @ObfuscatedName("bu")
   static final int[] field1462;
   @ObfuscatedName("c")
   int field1463;
   @ObfuscatedName("q")
   int field1464;
   @ObfuscatedName("av")
   static boolean field1465;
   @ObfuscatedName("ay")
   static int field1466;
   @ObfuscatedName("p")
   @Export("tiles")
   Tile[][][] tiles;
   @ObfuscatedName("d")
   public static boolean field1469;
   @ObfuscatedName("l")
   @Export("objects")
   GameObject[] objects;
   @ObfuscatedName("v")
   int[][][] field1471;
   @ObfuscatedName("t")
   int[][][] field1473;
   @ObfuscatedName("az")
   static int field1475;
   @ObfuscatedName("k")
   static int field1476;
   @ObfuscatedName("y")
   static int field1477;
   @ObfuscatedName("j")
   static int field1478;
   @ObfuscatedName("i")
   static int field1479;
   @ObfuscatedName("a")
   static int field1480;
   @ObfuscatedName("x")
   static int field1481;
   @ObfuscatedName("ae")
   public static int field1482;
   @ObfuscatedName("b")
   static int field1483;
   @ObfuscatedName("bk")
   int[][] field1484;
   @ObfuscatedName("o")
   static int field1485;
   @ObfuscatedName("m")
   static int field1486;
   @ObfuscatedName("h")
   static int field1487;
   @ObfuscatedName("am")
   static int field1488;
   @ObfuscatedName("ax")
   static int field1489;
   @ObfuscatedName("br")
   int[][] field1490;
   @ObfuscatedName("ac")
   static int field1491;
   @ObfuscatedName("ao")
   static GameObject[] field1492;
   @ObfuscatedName("ak")
   static boolean field1493;
   @ObfuscatedName("aa")
   static int field1494;
   @ObfuscatedName("aj")
   static int field1495;
   @ObfuscatedName("al")
   static final int[] field1497;
   @ObfuscatedName("aq")
   public static int field1498;
   @ObfuscatedName("f")
   static int field1499;
   @ObfuscatedName("af")
   static int field1502;
   @ObfuscatedName("ar")
   static int[] field1503;
   @ObfuscatedName("ab")
   static class94[][] field1504;
   @ObfuscatedName("as")
   static int field1505;
   @ObfuscatedName("ah")
   static final int[] field1506;
   @ObfuscatedName("ad")
   static Deque field1507;
   @ObfuscatedName("ap")
   static final int[] field1508;
   @ObfuscatedName("n")
   int field1509;
   @ObfuscatedName("at")
   static final int[] field1510;
   @ObfuscatedName("u")
   int field1511;
   @ObfuscatedName("ai")
   static class94[] field1512;
   @ObfuscatedName("au")
   static final int[] field1513;
   @ObfuscatedName("bo")
   static boolean[][][][] field1514;
   @ObfuscatedName("z")
   int field1515;
   @ObfuscatedName("an")
   static final int[] field1516;
   @ObfuscatedName("e")
   static int field1517;
   @ObfuscatedName("bw")
   @Export("renderArea")
   static boolean[][] renderArea;
   @ObfuscatedName("bi")
   static int field1519;
   @ObfuscatedName("bl")
   static int field1520;
   @ObfuscatedName("by")
   static int field1521;
   @ObfuscatedName("bv")
   static int field1522;
   @ObfuscatedName("bf")
   static int field1523;
   @ObfuscatedName("be")
   static int field1524;

   @ObfuscatedName("f")
   public void method1720(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.decorativeObject = null;
      }
   }

   @ObfuscatedName("d")
   public void method1721() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field1463; ++var1) {
         for(var2 = 0; var2 < this.field1509; ++var2) {
            for(int var3 = 0; var3 < this.field1464; ++var3) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field1502; ++var1) {
         for(var2 = 0; var2 < field1503[var1]; ++var2) {
            field1504[var1][var2] = null;
         }

         field1503[var1] = 0;
      }

      for(var1 = 0; var1 < this.field1515; ++var1) {
         this.objects[var1] = null;
      }

      this.field1515 = 0;

      for(var1 = 0; var1 < field1492.length; ++var1) {
         field1492[var1] = null;
      }

   }

   @ObfuscatedName("c")
   public void method1722(int var1) {
      this.field1511 = var1;

      for(int var2 = 0; var2 < this.field1509; ++var2) {
         for(int var3 = 0; var3 < this.field1464; ++var3) {
            if(this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("ah")
   static final int method1724(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("t")
   public void method1725(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 != null) {
         this.tiles[var1][var2][var3].field1330 = var4;
      }
   }

   @ObfuscatedName("az")
   public GroundObject method1726(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.groundObject != null?var4.groundObject:null;
   }

   @ObfuscatedName("x")
   void method1728(GameObject var1) {
      for(int var2 = var1.relativeX; var2 <= var1.offsetX; ++var2) {
         for(int var3 = var1.relativeY; var3 <= var1.offsetY; ++var3) {
            Tile var4 = this.tiles[var1.plane][var2][var3];
            if(var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field1323; ++var5) {
                  if(var4.objects[var5] == var1) {
                     --var4.field1323;

                     for(int var7 = var5; var7 < var4.field1323; ++var7) {
                        var4.objects[var7] = var4.objects[var7 + 1];
                        var4.field1328[var7] = var4.field1328[var7 + 1];
                     }

                     var4.objects[var4.field1323] = null;
                     break;
                  }
               }

               var4.field1326 = 0;

               for(var5 = 0; var5 < var4.field1323; ++var5) {
                  var4.field1326 |= var4.field1328[var5];
               }
            }
         }
      }

   }

   @ObfuscatedName("r")
   public void method1729(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10) {
      if(var5 != null || var6 != null) {
         WallObject var11 = new WallObject();
         var11.hash = var9;
         var11.field1541 = var10;
         var11.x = var2 * 128 + 64;
         var11.y = var3 * 128 + 64;
         var11.floor = var4;
         var11.renderable1 = var5;
         var11.renderable2 = var6;
         var11.field1536 = var7;
         var11.field1537 = var8;

         for(int var12 = var1; var12 >= 0; --var12) {
            if(this.tiles[var12][var2][var3] == null) {
               this.tiles[var12][var2][var3] = new Tile(var12, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].wallObject = var11;
      }
   }

   @ObfuscatedName("s")
   public void method1730(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if(var5 != null) {
         DecorativeObject var13 = new DecorativeObject();
         var13.hash = var11;
         var13.renderInfoBitPacked = var12;
         var13.x = var2 * 128 + 64;
         var13.y = var3 * 128 + 64;
         var13.floor = var4;
         var13.renderable1 = var5;
         var13.renderable2 = var6;
         var13.renderFlag = var7;
         var13.rotation = var8;
         var13.offsetX = var9;
         var13.offsetY = var10;

         for(int var14 = var1; var14 >= 0; --var14) {
            if(this.tiles[var14][var2][var3] == null) {
               this.tiles[var14][var2][var3] = new Tile(var14, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].decorativeObject = var13;
      }
   }

   @ObfuscatedName("aw")
   public void method1731(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.tiles[var4][var5][var6];
      if(var7 != null) {
         class85 var8 = var7.field1339;
         int var10;
         if(var8 != null) {
            int var9 = var8.field1444;
            if(var9 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var9;
                  var1[var2 + 1] = var9;
                  var1[var2 + 2] = var9;
                  var1[var2 + 3] = var9;
                  var2 += var3;
               }

            }
         } else {
            class77 var18 = var7.field1337;
            if(var18 != null) {
               var10 = var18.field1266;
               int var11 = var18.field1267;
               int var12 = var18.field1269;
               int var13 = var18.field1268;
               int[] var14 = this.field1490[var10];
               int[] var15 = this.field1484[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("e")
   public boolean method1732(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, int var8, boolean var9) {
      if(var6 == null) {
         return true;
      } else {
         int var10 = var2 - var5;
         int var11 = var3 - var5;
         int var12 = var2 + var5;
         int var13 = var3 + var5;
         if(var9) {
            if(var7 > 640 && var7 < 1408) {
               var13 += 128;
            }

            if(var7 > 1152 && var7 < 1920) {
               var12 += 128;
            }

            if(var7 > 1664 || var7 < 384) {
               var11 -= 128;
            }

            if(var7 > 128 && var7 < 896) {
               var10 -= 128;
            }
         }

         var10 /= 128;
         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         return this.method1734(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("i")
   boolean method1734(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, int var12, int var13) {
      int var15;
      for(int var14 = var2; var14 < var2 + var4; ++var14) {
         for(var15 = var3; var15 < var3 + var5; ++var15) {
            if(var14 < 0 || var15 < 0 || var14 >= this.field1509 || var15 >= this.field1464) {
               return false;
            }

            Tile var21 = this.tiles[var1][var14][var15];
            if(var21 != null && var21.field1323 >= 5) {
               return false;
            }
         }
      }

      GameObject var20 = new GameObject();
      var20.hash = var12;
      var20.flags = var13;
      var20.plane = var1;
      var20.x = var6;
      var20.y = var7;
      var20.height = var8;
      var20.renderable = var9;
      var20.orientation = var10;
      var20.relativeX = var2;
      var20.relativeY = var3;
      var20.offsetX = var2 + var4 - 1;
      var20.offsetY = var3 + var5 - 1;

      for(var15 = var2; var15 < var2 + var4; ++var15) {
         for(int var16 = var3; var16 < var3 + var5; ++var16) {
            int var17 = 0;
            if(var15 > var2) {
               ++var17;
            }

            if(var15 < var2 + var4 - 1) {
               var17 += 4;
            }

            if(var16 > var3) {
               var17 += 8;
            }

            if(var16 < var3 + var5 - 1) {
               var17 += 2;
            }

            for(int var22 = var1; var22 >= 0; --var22) {
               if(this.tiles[var22][var15][var16] == null) {
                  this.tiles[var22][var15][var16] = new Tile(var22, var15, var16);
               }
            }

            Tile var18 = this.tiles[var1][var15][var16];
            var18.objects[var18.field1323] = var20;
            var18.field1328[var18.field1323] = var17;
            var18.field1326 |= var17;
            ++var18.field1323;
         }
      }

      if(var11) {
         this.objects[this.field1515++] = var20;
      }

      return true;
   }

   @ObfuscatedName("a")
   public void method1735() {
      for(int var1 = 0; var1 < this.field1515; ++var1) {
         GameObject var2 = this.objects[var1];
         this.method1728(var2);
         this.objects[var1] = null;
      }

      this.field1515 = 0;
   }

   @ObfuscatedName("bo")
   boolean method1736(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.method1768(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method1773(var7 + 1, this.field1473[var1][var2][var4] - var6, var8 + 1) && this.method1773(var7 + 128 - 1, this.field1473[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1773(var7 + 128 - 1, this.field1473[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1773(var7 + 1, this.field1473[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field1471[var1][var7][var8] == -field1478) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field1473[var1][var2][var4] - var6;
         if(!this.method1773(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method1773(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method1773(var7, var9, var11)) {
                  return false;
               } else if(!this.method1773(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @ObfuscatedName("h")
   public void method1737(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 != null) {
         DecorativeObject var6 = var5.decorativeObject;
         if(var6 != null) {
            var6.offsetX = var6.offsetX * var4 / 16;
            var6.offsetY = var6.offsetY * var4 / 16;
         }
      }
   }

   @ObfuscatedName("b")
   public void method1738(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.wallObject = null;
      }
   }

   @ObfuscatedName("o")
   public void method1740(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field1323; ++var5) {
            GameObject var6 = var4.objects[var5];
            if((var6.hash >> 29 & 3) == 2 && var6.relativeX == var2 && var6.relativeY == var3) {
               this.method1728(var6);
               return;
            }
         }

      }
   }

   @ObfuscatedName("m")
   public void method1741(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.groundObject = null;
      }
   }

   @ObfuscatedName("al")
   void method1742(class85 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field1485;
      int var11;
      int var12 = var11 = (var8 << 7) - field1477;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field1473[var2][var7][var8] - field1486;
      int var18 = this.field1473[var2][var7 + 1][var8] - field1486;
      int var19 = this.field1473[var2][var7 + 1][var8 + 1] - field1486;
      int var20 = this.field1473[var2][var7][var8 + 1] - field1486;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if(var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if(var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if(var15 >= 50) {
                  int var22 = class84.field1427 + var10 * class84.field1426 / var12;
                  int var23 = class84.field1420 + var17 * class84.field1426 / var12;
                  int var24 = class84.field1427 + var14 * class84.field1426 / var11;
                  int var25 = class84.field1420 + var18 * class84.field1426 / var11;
                  int var26 = class84.field1427 + var13 * class84.field1426 / var16;
                  int var27 = class84.field1420 + var19 * class84.field1426 / var16;
                  int var28 = class84.field1427 + var9 * class84.field1426 / var15;
                  int var29 = class84.field1420 + var21 * class84.field1426 / var15;
                  class84.rasterAlpha = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class84.rasterClipEnable = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class84.rasterClipX || var28 > class84.rasterClipX || var24 > class84.rasterClipX) {
                        class84.rasterClipEnable = true;
                     }

                     if(field1493 && this.method1767(field1495, field1466, var27, var29, var25, var26, var28, var24)) {
                        field1482 = var7;
                        field1498 = var8;
                     }

                     if(var1.field1449 == -1) {
                        if(var1.field1446 != 12345678) {
                           class84.rasterGouraud(var27, var29, var25, var26, var28, var24, var1.field1446, var1.field1442, var1.field1443);
                        }
                     } else if(!field1469) {
                        if(var1.field1447) {
                           class84.rasterTexture(var27, var29, var25, var26, var28, var24, var1.field1446, var1.field1442, var1.field1443, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1449);
                        } else {
                           class84.rasterTexture(var27, var29, var25, var26, var28, var24, var1.field1446, var1.field1442, var1.field1443, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1449);
                        }
                     } else {
                        var30 = class84.field1437.vmethod1913(var1.field1449);
                        class84.rasterGouraud(var27, var29, var25, var26, var28, var24, method1724(var30, var1.field1446), method1724(var30, var1.field1442), method1724(var30, var1.field1443));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class84.rasterClipEnable = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class84.rasterClipX || var24 > class84.rasterClipX || var28 > class84.rasterClipX) {
                        class84.rasterClipEnable = true;
                     }

                     if(field1493 && this.method1767(field1495, field1466, var23, var25, var29, var22, var24, var28)) {
                        field1482 = var7;
                        field1498 = var8;
                     }

                     if(var1.field1449 == -1) {
                        if(var1.field1448 != 12345678) {
                           class84.rasterGouraud(var23, var25, var29, var22, var24, var28, var1.field1448, var1.field1443, var1.field1442);
                        }
                     } else if(!field1469) {
                        class84.rasterTexture(var23, var25, var29, var22, var24, var28, var1.field1448, var1.field1443, var1.field1442, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1449);
                     } else {
                        var30 = class84.field1437.vmethod1913(var1.field1449);
                        class84.rasterGouraud(var23, var25, var29, var22, var24, var28, method1724(var30, var1.field1448), method1724(var30, var1.field1443), method1724(var30, var1.field1442));
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("am")
   public WallObject method1743(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null?null:var4.wallObject;
   }

   @ObfuscatedName("ax")
   public DecorativeObject method1744(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null?null:var4.decorativeObject;
   }

   @ObfuscatedName("ac")
   public GameObject method1745(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field1323; ++var5) {
            GameObject var6 = var4.objects[var5];
            if((var6.hash >> 29 & 3) == 2 && var6.relativeX == var2 && var6.relativeY == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("k")
   public boolean method1746(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, int var9, int var10) {
      if(var7 == null) {
         return true;
      } else {
         int var11 = var2 * 128 + var5 * 64;
         int var12 = var3 * 128 + var6 * 64;
         return this.method1734(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
      }
   }

   @ObfuscatedName("ao")
   public int method1747(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.wallObject != null?var4.wallObject.hash:0;
   }

   @ObfuscatedName("j")
   public boolean method1748(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      return var6 == null?true:this.method1734(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedName("w")
   public void method1749(int var1, int var2, int var3, int var4, Renderable var5, int var6, Renderable var7, Renderable var8) {
      ItemLayer var9 = new ItemLayer();
      var9.bottom = var5;
      var9.x = var2 * 128 + 64;
      var9.y = var3 * 128 + 64;
      var9.hash = var4;
      var9.flags = var6;
      var9.middle = var7;
      var9.top = var8;
      int var10 = 0;
      Tile var11 = this.tiles[var1][var2][var3];
      if(var11 != null) {
         for(int var12 = 0; var12 < var11.field1323; ++var12) {
            if((var11.objects[var12].flags & 256) == 256 && var11.objects[var12].renderable instanceof Model) {
               Model var13 = (Model)var11.objects[var12].renderable;
               var13.method1574();
               if(var13.modelHeight > var10) {
                  var10 = var13.modelHeight;
               }
            }
         }
      }

      var9.height = var10;
      if(this.tiles[var1][var2][var3] == null) {
         this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.tiles[var1][var2][var3].itemLayer = var9;
   }

   @ObfuscatedName("aj")
   public int method1750(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.groundObject != null?var4.groundObject.hash:0;
   }

   @ObfuscatedName("ay")
   public int method1751(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 == null) {
         return -1;
      } else if(var5.wallObject != null && var5.wallObject.hash == var4) {
         return var5.wallObject.field1541 & 255;
      } else if(var5.decorativeObject != null && var5.decorativeObject.hash == var4) {
         return var5.decorativeObject.renderInfoBitPacked & 255;
      } else if(var5.groundObject != null && var5.groundObject.hash == var4) {
         return var5.groundObject.renderInfoBitPacked & 255;
      } else {
         for(int var6 = 0; var6 < var5.field1323; ++var6) {
            if(var5.objects[var6].hash == var4) {
               return var5.objects[var6].flags & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("aq")
   void method1753(ModelData var1, int var2, int var3, int var4) {
      Tile var5;
      ModelData var6;
      if(var3 < this.field1509) {
         var5 = this.tiles[var2][var3 + 1][var4];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1514(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field1509) {
         var5 = this.tiles[var2][var3][var4 + 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1514(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field1509 && var4 < this.field1464) {
         var5 = this.tiles[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1514(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field1509 && var4 > 0) {
         var5 = this.tiles[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1514(var1, var6, 128, 0, -128, true);
         }
      }

   }

   @ObfuscatedName("av")
   void method1754(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field1463) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field1509) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field1464 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        Tile var15 = this.tiles[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field1473[var12][var13][var14] + this.field1473[var12][var13 + 1][var14] + this.field1473[var12][var13][var14 + 1] + this.field1473[var12][var13 + 1][var14 + 1]) / 4 - (this.field1473[var2][var3][var4] + this.field1473[var2][var3 + 1][var4] + this.field1473[var2][var3][var4 + 1] + this.field1473[var2][var3 + 1][var4 + 1]) / 4;
                           WallObject var17 = var15.wallObject;
                           if(var17 != null) {
                              ModelData var18;
                              if(var17.renderable1 instanceof ModelData) {
                                 var18 = (ModelData)var17.renderable1;
                                 ModelData.method1514(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.renderable2 instanceof ModelData) {
                                 var18 = (ModelData)var17.renderable2;
                                 ModelData.method1514(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field1323; ++var23) {
                              GameObject var19 = var15.objects[var23];
                              if(var19 != null && var19.renderable instanceof ModelData) {
                                 ModelData var20 = (ModelData)var19.renderable;
                                 int var21 = var19.offsetX - var19.relativeX + 1;
                                 int var22 = var19.offsetY - var19.relativeY + 1;
                                 ModelData.method1514(var1, var20, (var19.relativeX - var3) * 128 + (var21 - var5) * 64, var16, (var19.relativeY - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @ObfuscatedName("ag")
   public static void method1756(int[] var0, int var1, int var2, int var3, int var4) {
      field1521 = 0;
      field1522 = 0;
      field1523 = var3;
      field1524 = var4;
      field1519 = var3 / 2;
      field1520 = var4 / 2;
      boolean[][][][] var5 = new boolean[9][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 384; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field1488 = class84.field1433[var6];
            field1489 = class84.field1441[var6];
            field1491 = class84.field1433[var7];
            field1475 = class84.field1441[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 <= 26; ++var10) {
               for(var11 = -26; var11 <= 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if(method1757(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label105:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if(var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }

                        if(var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }

                        if(var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }

                        if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label105;
                        }
                     }
                  }

                  field1514[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   @ObfuscatedName("af")
   static boolean method1757(int var0, int var1, int var2) {
      int var3 = var2 * field1491 + var0 * field1475 >> 16;
      int var4 = var2 * field1475 - var0 * field1491 >> 16;
      int var5 = var1 * field1488 + var4 * field1489 >> 16;
      int var6 = var1 * field1489 - var4 * field1488 >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var7 = field1519 + var3 * class84.field1426 / var5;
         int var8 = field1520 + var6 * class84.field1426 / var5;
         return var7 >= field1521 && var7 <= field1523 && var8 >= field1522 && var8 <= field1524;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ar")
   public void method1758(int var1, int var2, int var3, boolean var4) {
      if(!method1788() || var4) {
         field1493 = true;
         field1465 = var4;
         field1494 = var1;
         field1495 = var2;
         field1466 = var3;
         field1482 = -1;
         field1498 = -1;
      }
   }

   @ObfuscatedName("ai")
   public static void method1761() {
      field1482 = -1;
      field1465 = false;
   }

   @ObfuscatedName("an")
   void method1763(Tile var1, boolean var2) {
      field1507.method2824(var1);

      while(true) {
         Tile var3;
         int var4;
         int var5;
         int var6;
         int var7;
         Tile[][] var8;
         Tile var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var25;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              WallObject var10;
                              GameObject var12;
                              int var17;
                              int var18;
                              boolean var20;
                              int var21;
                              Tile var36;
                              while(true) {
                                 do {
                                    var3 = (Tile)field1507.method2826();
                                    if(var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field1332);

                                 var4 = var3.x;
                                 var5 = var3.y;
                                 var6 = var3.plane;
                                 var7 = var3.field1319;
                                 var8 = this.tiles[var6];
                                 if(!var3.field1331) {
                                    break;
                                 }

                                 if(var2) {
                                    if(var6 > 0) {
                                       var9 = this.tiles[var6 - 1][var4][var5];
                                       if(var9 != null && var9.field1332) {
                                          continue;
                                       }
                                    }

                                    if(var4 <= field1483 && var4 > field1479) {
                                       var9 = var8[var4 - 1][var5];
                                       if(var9 != null && var9.field1332 && (var9.field1331 || (var3.field1326 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var4 >= field1483 && var4 < field1480 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if(var9 != null && var9.field1332 && (var9.field1331 || (var3.field1326 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 <= field1499 && var5 > field1481) {
                                       var9 = var8[var4][var5 - 1];
                                       if(var9 != null && var9.field1332 && (var9.field1331 || (var3.field1326 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 >= field1499 && var5 < field1487 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if(var9 != null && var9.field1332 && (var9.field1331 || (var3.field1326 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field1331 = false;
                                 if(var3.field1338 != null) {
                                    var9 = var3.field1338;
                                    if(var9.field1339 != null) {
                                       if(!this.method1768(0, var4, var5)) {
                                          this.method1742(var9.field1339, 0, field1488, field1489, field1491, field1475, var4, var5);
                                       }
                                    } else if(var9.field1337 != null && !this.method1768(0, var4, var5)) {
                                       this.method1816(var9.field1337, field1488, field1489, field1491, field1475, var4, var5);
                                    }

                                    var10 = var9.wallObject;
                                    if(var10 != null) {
                                       var10.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var10.x - field1485, var10.floor - field1486, var10.y - field1477, var10.hash);
                                    }

                                    for(var11 = 0; var11 < var9.field1323; ++var11) {
                                       var12 = var9.objects[var11];
                                       if(var12 != null) {
                                          var12.renderable.vmethod1902(var12.orientation, field1488, field1489, field1491, field1475, var12.x - field1485, var12.height - field1486, var12.y - field1477, var12.hash);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if(var3.field1339 != null) {
                                    if(!this.method1768(var7, var4, var5)) {
                                       var20 = true;
                                       if(var3.field1339.field1446 != 12345678 || field1493 && var6 <= field1494) {
                                          this.method1742(var3.field1339, var7, field1488, field1489, field1491, field1475, var4, var5);
                                       }
                                    }
                                 } else if(var3.field1337 != null && !this.method1768(var7, var4, var5)) {
                                    var20 = true;
                                    this.method1816(var3.field1337, field1488, field1489, field1491, field1475, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 WallObject var31 = var3.wallObject;
                                 DecorativeObject var13 = var3.decorativeObject;
                                 if(var31 != null || var13 != null) {
                                    if(field1483 == var4) {
                                       ++var21;
                                    } else if(field1483 < var4) {
                                       var21 += 2;
                                    }

                                    if(field1499 == var5) {
                                       var21 += 3;
                                    } else if(field1499 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field1516[var21];
                                    var3.field1324 = field1510[var21];
                                 }

                                 if(var31 != null) {
                                    if((var31.field1536 & field1497[var21]) != 0) {
                                       if(var31.field1536 == 16) {
                                          var3.field1334 = 3;
                                          var3.field1335 = field1506[var21];
                                          var3.field1336 = 3 - var3.field1335;
                                       } else if(var31.field1536 == 32) {
                                          var3.field1334 = 6;
                                          var3.field1335 = field1508[var21];
                                          var3.field1336 = 6 - var3.field1335;
                                       } else if(var31.field1536 == 64) {
                                          var3.field1334 = 12;
                                          var3.field1335 = field1513[var21];
                                          var3.field1336 = 12 - var3.field1335;
                                       } else {
                                          var3.field1334 = 9;
                                          var3.field1335 = field1462[var21];
                                          var3.field1336 = 9 - var3.field1335;
                                       }
                                    } else {
                                       var3.field1334 = 0;
                                    }

                                    if((var31.field1536 & var11) != 0 && !this.method1817(var7, var4, var5, var31.field1536)) {
                                       var31.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var31.x - field1485, var31.floor - field1486, var31.y - field1477, var31.hash);
                                    }

                                    if((var31.field1537 & var11) != 0 && !this.method1817(var7, var4, var5, var31.field1537)) {
                                       var31.renderable2.vmethod1902(0, field1488, field1489, field1491, field1475, var31.x - field1485, var31.floor - field1486, var31.y - field1477, var31.hash);
                                    }
                                 }

                                 if(var13 != null && !this.method1771(var7, var4, var5, var13.renderable1.modelHeight)) {
                                    if((var13.renderFlag & var11) != 0) {
                                       var13.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var13.x - field1485 + var13.offsetX, var13.floor - field1486, var13.y - field1477 + var13.offsetY, var13.hash);
                                    } else if(var13.renderFlag == 256) {
                                       var14 = var13.x - field1485;
                                       var15 = var13.floor - field1486;
                                       var16 = var13.y - field1477;
                                       var17 = var13.rotation;
                                       if(var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if(var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if(var19 < var18) {
                                          var13.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var14 + var13.offsetX, var15, var16 + var13.offsetY, var13.hash);
                                       } else if(var13.renderable2 != null) {
                                          var13.renderable2.vmethod1902(0, field1488, field1489, field1491, field1475, var14, var15, var16, var13.hash);
                                       }
                                    }
                                 }

                                 if(var20) {
                                    GroundObject var22 = var3.groundObject;
                                    if(var22 != null) {
                                       var22.renderable.vmethod1902(0, field1488, field1489, field1491, field1475, var22.x - field1485, var22.floor - field1486, var22.y - field1477, var22.hash);
                                    }

                                    ItemLayer var23 = var3.itemLayer;
                                    if(var23 != null && var23.height == 0) {
                                       if(var23.middle != null) {
                                          var23.middle.vmethod1902(0, field1488, field1489, field1491, field1475, var23.x - field1485, var23.hash - field1486, var23.y - field1477, var23.flags);
                                       }

                                       if(var23.top != null) {
                                          var23.top.vmethod1902(0, field1488, field1489, field1491, field1475, var23.x - field1485, var23.hash - field1486, var23.y - field1477, var23.flags);
                                       }

                                       if(var23.bottom != null) {
                                          var23.bottom.vmethod1902(0, field1488, field1489, field1491, field1475, var23.x - field1485, var23.hash - field1486, var23.y - field1477, var23.flags);
                                       }
                                    }
                                 }

                                 var14 = var3.field1326;
                                 if(var14 != 0) {
                                    if(var4 < field1483 && (var14 & 4) != 0) {
                                       var36 = var8[var4 + 1][var5];
                                       if(var36 != null && var36.field1332) {
                                          field1507.method2824(var36);
                                       }
                                    }

                                    if(var5 < field1499 && (var14 & 2) != 0) {
                                       var36 = var8[var4][var5 + 1];
                                       if(var36 != null && var36.field1332) {
                                          field1507.method2824(var36);
                                       }
                                    }

                                    if(var4 > field1483 && (var14 & 1) != 0) {
                                       var36 = var8[var4 - 1][var5];
                                       if(var36 != null && var36.field1332) {
                                          field1507.method2824(var36);
                                       }
                                    }

                                    if(var5 > field1499 && (var14 & 8) != 0) {
                                       var36 = var8[var4][var5 - 1];
                                       if(var36 != null && var36.field1332) {
                                          field1507.method2824(var36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if(var3.field1334 != 0) {
                                 var20 = true;

                                 for(var21 = 0; var21 < var3.field1323; ++var21) {
                                    if(var3.objects[var21].field1608 != field1478 && (var3.field1328[var21] & var3.field1334) == var3.field1335) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if(var20) {
                                    var10 = var3.wallObject;
                                    if(!this.method1817(var7, var4, var5, var10.field1536)) {
                                       var10.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var10.x - field1485, var10.floor - field1486, var10.y - field1477, var10.hash);
                                    }

                                    var3.field1334 = 0;
                                 }
                              }

                              if(!var3.field1333) {
                                 break;
                              }

                              try {
                                 int var34 = var3.field1323;
                                 var3.field1333 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var34; ++var11) {
                                    var12 = var3.objects[var11];
                                    if(var12.field1608 != field1478) {
                                       for(var24 = var12.relativeX; var24 <= var12.offsetX; ++var24) {
                                          for(var14 = var12.relativeY; var14 <= var12.offsetY; ++var14) {
                                             var36 = var8[var24][var14];
                                             if(var36.field1331) {
                                                var3.field1333 = true;
                                                continue label563;
                                             }

                                             if(var36.field1334 != 0) {
                                                var16 = 0;
                                                if(var24 > var12.relativeX) {
                                                   ++var16;
                                                }

                                                if(var24 < var12.offsetX) {
                                                   var16 += 4;
                                                }

                                                if(var14 > var12.relativeY) {
                                                   var16 += 8;
                                                }

                                                if(var14 < var12.offsetY) {
                                                   var16 += 2;
                                                }

                                                if((var16 & var36.field1334) == var3.field1336) {
                                                   var3.field1333 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field1492[var21++] = var12;
                                       var24 = field1483 - var12.relativeX;
                                       var14 = var12.offsetX - field1483;
                                       if(var14 > var24) {
                                          var24 = var14;
                                       }

                                       var15 = field1499 - var12.relativeY;
                                       var16 = var12.offsetY - field1499;
                                       if(var16 > var15) {
                                          var12.field1605 = var24 + var16;
                                       } else {
                                          var12.field1605 = var24 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var25 = -1;

                                    for(var24 = 0; var24 < var21; ++var24) {
                                       GameObject var35 = field1492[var24];
                                       if(var35.field1608 != field1478) {
                                          if(var35.field1605 > var11) {
                                             var11 = var35.field1605;
                                             var25 = var24;
                                          } else if(var35.field1605 == var11) {
                                             var15 = var35.x - field1485;
                                             var16 = var35.y - field1477;
                                             var17 = field1492[var25].x - field1485;
                                             var18 = field1492[var25].y - field1477;
                                             if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var25 = var24;
                                             }
                                          }
                                       }
                                    }

                                    if(var25 == -1) {
                                       break;
                                    }

                                    GameObject var33 = field1492[var25];
                                    var33.field1608 = field1478;
                                    if(!this.method1736(var7, var33.relativeX, var33.offsetX, var33.relativeY, var33.offsetY, var33.renderable.modelHeight)) {
                                       var33.renderable.vmethod1902(var33.orientation, field1488, field1489, field1491, field1475, var33.x - field1485, var33.height - field1486, var33.y - field1477, var33.hash);
                                    }

                                    for(var14 = var33.relativeX; var14 <= var33.offsetX; ++var14) {
                                       for(var15 = var33.relativeY; var15 <= var33.offsetY; ++var15) {
                                          Tile var26 = var8[var14][var15];
                                          if(var26.field1334 != 0) {
                                             field1507.method2824(var26);
                                          } else if((var14 != var4 || var15 != var5) && var26.field1332) {
                                             field1507.method2824(var26);
                                          }
                                       }
                                    }
                                 }

                                 if(!var3.field1333) {
                                    break;
                                 }
                              } catch (Exception var28) {
                                 var3.field1333 = false;
                                 break;
                              }
                           }
                        } while(!var3.field1332);
                     } while(var3.field1334 != 0);

                     if(var4 > field1483 || var4 <= field1479) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field1332);

                  if(var4 < field1483 || var4 >= field1480 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field1332);

               if(var5 > field1499 || var5 <= field1481) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field1332);

            if(var5 < field1499 || var5 >= field1487 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field1332);

         var3.field1332 = false;
         --field1476;
         ItemLayer var32 = var3.itemLayer;
         if(var32 != null && var32.height != 0) {
            if(var32.middle != null) {
               var32.middle.vmethod1902(0, field1488, field1489, field1491, field1475, var32.x - field1485, var32.hash - field1486 - var32.height, var32.y - field1477, var32.flags);
            }

            if(var32.top != null) {
               var32.top.vmethod1902(0, field1488, field1489, field1491, field1475, var32.x - field1485, var32.hash - field1486 - var32.height, var32.y - field1477, var32.flags);
            }

            if(var32.bottom != null) {
               var32.bottom.vmethod1902(0, field1488, field1489, field1491, field1475, var32.x - field1485, var32.hash - field1486 - var32.height, var32.y - field1477, var32.flags);
            }
         }

         if(var3.field1324 != 0) {
            DecorativeObject var29 = var3.decorativeObject;
            if(var29 != null && !this.method1771(var7, var4, var5, var29.renderable1.modelHeight)) {
               if((var29.renderFlag & var3.field1324) != 0) {
                  var29.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var29.x - field1485 + var29.offsetX, var29.floor - field1486, var29.y - field1477 + var29.offsetY, var29.hash);
               } else if(var29.renderFlag == 256) {
                  var11 = var29.x - field1485;
                  var25 = var29.floor - field1486;
                  var24 = var29.y - field1477;
                  var14 = var29.rotation;
                  if(var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if(var14 != 2 && var14 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if(var16 >= var15) {
                     var29.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var11 + var29.offsetX, var25, var24 + var29.offsetY, var29.hash);
                  } else if(var29.renderable2 != null) {
                     var29.renderable2.vmethod1902(0, field1488, field1489, field1491, field1475, var11, var25, var24, var29.hash);
                  }
               }
            }

            WallObject var27 = var3.wallObject;
            if(var27 != null) {
               if((var27.field1537 & var3.field1324) != 0 && !this.method1817(var7, var4, var5, var27.field1537)) {
                  var27.renderable2.vmethod1902(0, field1488, field1489, field1491, field1475, var27.x - field1485, var27.floor - field1486, var27.y - field1477, var27.hash);
               }

               if((var27.field1536 & var3.field1324) != 0 && !this.method1817(var7, var4, var5, var27.field1536)) {
                  var27.renderable1.vmethod1902(0, field1488, field1489, field1491, field1475, var27.x - field1485, var27.floor - field1486, var27.y - field1477, var27.hash);
               }
            }
         }

         Tile var30;
         if(var6 < this.field1463 - 1) {
            var30 = this.tiles[var6 + 1][var4][var5];
            if(var30 != null && var30.field1332) {
               field1507.method2824(var30);
            }
         }

         if(var4 < field1483) {
            var30 = var8[var4 + 1][var5];
            if(var30 != null && var30.field1332) {
               field1507.method2824(var30);
            }
         }

         if(var5 < field1499) {
            var30 = var8[var4][var5 + 1];
            if(var30 != null && var30.field1332) {
               field1507.method2824(var30);
            }
         }

         if(var4 > field1483) {
            var30 = var8[var4 - 1][var5];
            if(var30 != null && var30.field1332) {
               field1507.method2824(var30);
            }
         }

         if(var5 > field1499) {
            var30 = var8[var4][var5 - 1];
            if(var30 != null && var30.field1332) {
               field1507.method2824(var30);
            }
         }
      }
   }

   @ObfuscatedName("ap")
   boolean method1767(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var2 < var3 && var2 < var4 && var2 < var5) {
         return false;
      } else if(var2 > var3 && var2 > var4 && var2 > var5) {
         return false;
      } else if(var1 < var6 && var1 < var7 && var1 < var8) {
         return false;
      } else if(var1 > var6 && var1 > var7 && var1 > var8) {
         return false;
      } else {
         int var9 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
         int var10 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
         int var11 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
         return var9 * var11 > 0 && var11 * var10 > 0;
      }
   }

   @ObfuscatedName("bu")
   boolean method1768(int var1, int var2, int var3) {
      int var4 = this.field1471[var1][var2][var3];
      if(var4 == -field1478) {
         return false;
      } else if(var4 == field1478) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method1773(var5 + 1, this.field1473[var1][var2][var3], var6 + 1) && this.method1773(var5 + 128 - 1, this.field1473[var1][var2 + 1][var3], var6 + 1) && this.method1773(var5 + 128 - 1, this.field1473[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1773(var5 + 1, this.field1473[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field1471[var1][var2][var3] = field1478;
            return true;
         } else {
            this.field1471[var1][var2][var3] = -field1478;
            return false;
         }
      }
   }

   @ObfuscatedName("bk")
   boolean method1771(int var1, int var2, int var3, int var4) {
      if(!this.method1768(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method1773(var5 + 1, this.field1473[var1][var2][var3] - var4, var6 + 1) && this.method1773(var5 + 128 - 1, this.field1473[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1773(var5 + 128 - 1, this.field1473[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1773(var5 + 1, this.field1473[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedName("bw")
   boolean method1773(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field1505; ++var4) {
         class94 var5 = field1512[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field1570 == 1) {
            var6 = var5.field1578 - var1;
            if(var6 > 0) {
               var7 = var5.field1566 + (var5.field1573 * var6 >> 8);
               var8 = var5.field1577 + (var5.field1582 * var6 >> 8);
               var9 = var5.field1568 + (var5.field1574 * var6 >> 8);
               var10 = var5.field1569 + (var5.field1576 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1570 == 2) {
            var6 = var1 - var5.field1578;
            if(var6 > 0) {
               var7 = var5.field1566 + (var5.field1573 * var6 >> 8);
               var8 = var5.field1577 + (var5.field1582 * var6 >> 8);
               var9 = var5.field1568 + (var5.field1574 * var6 >> 8);
               var10 = var5.field1569 + (var5.field1576 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1570 == 3) {
            var6 = var5.field1566 - var3;
            if(var6 > 0) {
               var7 = var5.field1578 + (var5.field1571 * var6 >> 8);
               var8 = var5.field1579 + (var5.field1572 * var6 >> 8);
               var9 = var5.field1568 + (var5.field1574 * var6 >> 8);
               var10 = var5.field1569 + (var5.field1576 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1570 == 4) {
            var6 = var3 - var5.field1566;
            if(var6 > 0) {
               var7 = var5.field1578 + (var5.field1571 * var6 >> 8);
               var8 = var5.field1579 + (var5.field1572 * var6 >> 8);
               var9 = var5.field1568 + (var5.field1574 * var6 >> 8);
               var10 = var5.field1569 + (var5.field1576 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1570 == 5) {
            var6 = var2 - var5.field1568;
            if(var6 > 0) {
               var7 = var5.field1578 + (var5.field1571 * var6 >> 8);
               var8 = var5.field1579 + (var5.field1572 * var6 >> 8);
               var9 = var5.field1566 + (var5.field1573 * var6 >> 8);
               var10 = var5.field1577 + (var5.field1582 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   static {
      field1469 = true;
      field1476 = 0;
      field1517 = 0;
      field1492 = new GameObject[100];
      field1493 = false;
      field1494 = 0;
      field1495 = 0;
      field1466 = 0;
      field1482 = -1;
      field1498 = -1;
      field1465 = false;
      field1502 = 4;
      field1503 = new int[field1502];
      field1504 = new class94[field1502][500];
      field1505 = 0;
      field1512 = new class94[500];
      field1507 = new Deque();
      field1516 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1497 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field1510 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field1506 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field1508 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field1513 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field1462 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field1514 = new boolean[8][32][51][51];
   }

   @ObfuscatedName("ad")
   public void method1784(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field1509 * 128) {
         var1 = this.field1509 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field1464 * 128) {
         var3 = this.field1464 * 128 - 1;
      }

      ++field1478;
      field1488 = class84.field1433[var4];
      field1489 = class84.field1441[var4];
      field1491 = class84.field1433[var5];
      field1475 = class84.field1441[var5];
      renderArea = field1514[(var4 - 128) / 32][var5 / 64];
      field1485 = var1;
      field1486 = var2;
      field1477 = var3;
      field1483 = var1 / 128;
      field1499 = var3 / 128;
      field1517 = var6;
      field1479 = field1483 - 25;
      if(field1479 < 0) {
         field1479 = 0;
      }

      field1481 = field1499 - 25;
      if(field1481 < 0) {
         field1481 = 0;
      }

      field1480 = field1483 + 25;
      if(field1480 > this.field1509) {
         field1480 = this.field1509;
      }

      field1487 = field1499 + 25;
      if(field1487 > this.field1464) {
         field1487 = this.field1464;
      }

      this.method1889();
      field1476 = 0;

      int var7;
      Tile[][] var8;
      int var9;
      int var10;
      for(var7 = this.field1511; var7 < this.field1463; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = field1479; var9 < field1480; ++var9) {
            for(var10 = field1481; var10 < field1487; ++var10) {
               Tile var16 = var8[var9][var10];
               if(var16 != null) {
                  if(var16.field1330 > var6 || !renderArea[var9 - field1483 + 25][var10 - field1499 + 25] && this.field1473[var7][var9][var10] - var2 < 2000) {
                     var16.field1331 = false;
                     var16.field1332 = false;
                     var16.field1334 = 0;
                  } else {
                     var16.field1331 = true;
                     var16.field1332 = true;
                     if(var16.field1323 > 0) {
                        var16.field1333 = true;
                     } else {
                        var16.field1333 = false;
                     }

                     ++field1476;
                  }
               }
            }
         }
      }

      int var11;
      int var12;
      int var13;
      int var14;
      Tile var15;
      for(var7 = this.field1511; var7 < this.field1463; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field1483 + var9;
            var11 = field1483 - var9;
            if(var10 >= field1479 || var11 < field1480) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field1499 + var12;
                  var14 = field1499 - var12;
                  if(var10 >= field1479) {
                     if(var13 >= field1481) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, true);
                        }
                     }

                     if(var14 < field1487) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, true);
                        }
                     }
                  }

                  if(var11 < field1480) {
                     if(var13 >= field1481) {
                        var15 = var8[var11][var13];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, true);
                        }
                     }

                     if(var14 < field1487) {
                        var15 = var8[var11][var14];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, true);
                        }
                     }
                  }

                  if(field1476 == 0) {
                     field1493 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field1511; var7 < this.field1463; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field1483 + var9;
            var11 = field1483 - var9;
            if(var10 >= field1479 || var11 < field1480) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field1499 + var12;
                  var14 = field1499 - var12;
                  if(var10 >= field1479) {
                     if(var13 >= field1481) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, false);
                        }
                     }

                     if(var14 < field1487) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, false);
                        }
                     }
                  }

                  if(var11 < field1480) {
                     if(var13 >= field1481) {
                        var15 = var8[var11][var13];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, false);
                        }
                     }

                     if(var14 < field1487) {
                        var15 = var8[var11][var14];
                        if(var15 != null && var15.field1331) {
                           this.method1763(var15, false);
                        }
                     }
                  }

                  if(field1476 == 0) {
                     field1493 = false;
                     return;
                  }
               }
            }
         }
      }

      field1493 = false;
   }

   @ObfuscatedName("as")
   public static boolean method1788() {
      return field1465 && field1482 != -1;
   }

   public Region(int var1, int var2, int var3, int[][][] var4) {
      this.field1511 = 0;
      this.field1515 = 0;
      this.objects = new GameObject[5000];
      this.field1490 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.field1484 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.field1463 = var1;
      this.field1509 = var2;
      this.field1464 = var3;
      this.tiles = new Tile[var1][var2][var3];
      this.field1471 = new int[var1][var2 + 1][var3 + 1];
      this.field1473 = var4;
      this.method1721();
   }

   @ObfuscatedName("y")
   public void method1801(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.itemLayer = null;
      }
   }

   @ObfuscatedName("ak")
   public int method1805(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.decorativeObject != null?var4.decorativeObject.hash:0;
   }

   @ObfuscatedName("at")
   void method1816(class77 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field1272.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1272[var9] - field1485;
         var11 = var1.field1256[var9] - field1486;
         var12 = var1.field1257[var9] - field1477;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field1273 != null) {
            class77.field1262[var9] = var10;
            class77.field1270[var9] = var13;
            class77.field1274[var9] = var12;
         }

         class77.field1264[var9] = class84.field1427 + var10 * class84.field1426 / var12;
         class77.field1271[var9] = class84.field1420 + var13 * class84.field1426 / var12;
      }

      class84.rasterAlpha = 0;
      var8 = var1.field1255.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1255[var9];
         var11 = var1.field1276[var9];
         var12 = var1.field1263[var9];
         var13 = class77.field1264[var10];
         int var14 = class77.field1264[var11];
         int var15 = class77.field1264[var12];
         int var16 = class77.field1271[var10];
         int var17 = class77.field1271[var11];
         int var18 = class77.field1271[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class84.rasterClipEnable = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class84.rasterClipX || var14 > class84.rasterClipX || var15 > class84.rasterClipX) {
               class84.rasterClipEnable = true;
            }

            if(field1493 && this.method1767(field1495, field1466, var16, var17, var18, var13, var14, var15)) {
               field1482 = var6;
               field1498 = var7;
            }

            if(var1.field1273 != null && var1.field1273[var9] != -1) {
               if(!field1469) {
                  if(var1.field1265) {
                     class84.rasterTexture(var16, var17, var18, var13, var14, var15, var1.field1258[var9], var1.field1259[var9], var1.field1260[var9], class77.field1262[0], class77.field1262[1], class77.field1262[3], class77.field1270[0], class77.field1270[1], class77.field1270[3], class77.field1274[0], class77.field1274[1], class77.field1274[3], var1.field1273[var9]);
                  } else {
                     class84.rasterTexture(var16, var17, var18, var13, var14, var15, var1.field1258[var9], var1.field1259[var9], var1.field1260[var9], class77.field1262[var10], class77.field1262[var11], class77.field1262[var12], class77.field1270[var10], class77.field1270[var11], class77.field1270[var12], class77.field1274[var10], class77.field1274[var11], class77.field1274[var12], var1.field1273[var9]);
                  }
               } else {
                  int var19 = class84.field1437.vmethod1913(var1.field1273[var9]);
                  class84.rasterGouraud(var16, var17, var18, var13, var14, var15, method1724(var19, var1.field1258[var9]), method1724(var19, var1.field1259[var9]), method1724(var19, var1.field1260[var9]));
               }
            } else if(var1.field1258[var9] != 12345678) {
               class84.rasterGouraud(var16, var17, var18, var13, var14, var15, var1.field1258[var9], var1.field1259[var9], var1.field1260[var9]);
            }
         }
      }

   }

   @ObfuscatedName("br")
   boolean method1817(int var1, int var2, int var3, int var4) {
      if(!this.method1768(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field1473[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field1485) {
                  if(!this.method1773(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method1773(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1773(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method1773(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1773(var5, var9, var6)) {
                  return false;
               }

               if(!this.method1773(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field1477) {
                  if(!this.method1773(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method1773(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1773(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method1773(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1773(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method1773(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field1485) {
                  if(!this.method1773(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method1773(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1773(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method1773(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1773(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method1773(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field1477) {
                  if(!this.method1773(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method1773(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1773(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method1773(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method1773(var5, var9, var6)) {
                  return false;
               }

               if(!this.method1773(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method1773(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method1773(var5, var9, var6 + 128):(var4 == 32?this.method1773(var5 + 128, var9, var6 + 128):(var4 == 64?this.method1773(var5 + 128, var9, var6):(var4 == 128?this.method1773(var5, var9, var6):true))));
      }
   }

   @ObfuscatedName("aa")
   public int method1818(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 == null) {
         return 0;
      } else {
         for(int var5 = 0; var5 < var4.field1323; ++var5) {
            GameObject var6 = var4.objects[var5];
            if((var6.hash >> 29 & 3) == 2 && var6.relativeX == var2 && var6.relativeY == var3) {
               return var6.hash;
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("n")
   public void method1823(int var1, int var2) {
      Tile var3 = this.tiles[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
         if(var5 != null) {
            --var5.plane;

            for(int var6 = 0; var6 < var5.field1323; ++var6) {
               GameObject var7 = var5.objects[var6];
               if((var7.hash >> 29 & 3) == 2 && var7.relativeX == var1 && var7.relativeY == var2) {
                  --var7.plane;
               }
            }
         }
      }

      if(this.tiles[0][var1][var2] == null) {
         this.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.tiles[0][var1][var2].field1338 = var3;
      this.tiles[3][var1][var2] = null;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-50"
   )
   public void method1839(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1463; ++var4) {
         for(int var5 = 0; var5 < this.field1509; ++var5) {
            for(int var6 = 0; var6 < this.field1464; ++var6) {
               Tile var7 = this.tiles[var4][var5][var6];
               if(var7 != null) {
                  WallObject var8 = var7.wallObject;
                  ModelData var10;
                  if(var8 != null && var8.renderable1 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.renderable1;
                     this.method1754(var9, var4, var5, var6, 1, 1);
                     if(var8.renderable2 instanceof ModelData) {
                        var10 = (ModelData)var8.renderable2;
                        this.method1754(var10, var4, var5, var6, 1, 1);
                        ModelData.method1514(var9, var10, 0, 0, 0, false);
                        var8.renderable2 = var10.method1502(var10.field1240, var10.field1218, var1, var2, var3);
                     }

                     var8.renderable1 = var9.method1502(var9.field1240, var9.field1218, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field1323; ++var12) {
                     GameObject var14 = var7.objects[var12];
                     if(var14 != null && var14.renderable instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.renderable;
                        this.method1754(var11, var4, var5, var6, var14.offsetX - var14.relativeX + 1, var14.offsetY - var14.relativeY + 1);
                        var14.renderable = var11.method1502(var11.field1240, var11.field1218, var1, var2, var3);
                     }
                  }

                  GroundObject var13 = var7.groundObject;
                  if(var13 != null && var13.renderable instanceof ModelData) {
                     var10 = (ModelData)var13.renderable;
                     this.method1753(var10, var4, var5, var6);
                     var13.renderable = var10.method1502(var10.field1240, var10.field1218, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ab")
   public void method1857() {
      field1465 = true;
   }

   @ObfuscatedName("p")
   public void method1859(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class85 var21;
      int var22;
      if(var4 == 0) {
         var21 = new class85(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].field1339 = var21;
      } else if(var4 != 1) {
         class77 var23 = new class77(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].field1337 = var23;
      } else {
         var21 = new class85(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].field1339 = var21;
      }
   }

   @ObfuscatedName("q")
   public static void method1881(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class94 var8 = new class94();
      var8.field1559 = var2 / 128;
      var8.field1560 = var3 / 128;
      var8.field1561 = var4 / 128;
      var8.field1562 = var5 / 128;
      var8.field1575 = var1;
      var8.field1578 = var2;
      var8.field1579 = var3;
      var8.field1566 = var4;
      var8.field1577 = var5;
      var8.field1568 = var6;
      var8.field1569 = var7;
      field1504[var0][field1503[var0]++] = var8;
   }

   @ObfuscatedName("u")
   @Export("groundObjectSpawned")
   public void groundObjectSpawned(int var1, int var2, int var3, int var4, Renderable var5, int var6, int var7) {
      if(var5 != null) {
         GroundObject var8 = new GroundObject();
         var8.renderable = var5;
         var8.x = var2 * 128 + 64;
         var8.y = var3 * 128 + 64;
         var8.floor = var4;
         var8.hash = var6;
         var8.renderInfoBitPacked = var7;
         if(this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.tiles[var1][var2][var3].groundObject = var8;
      }
   }

   @ObfuscatedName("au")
   void method1889() {
      int var1 = field1503[field1517];
      class94[] var2 = field1504[field1517];
      field1505 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class94 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if(var4.field1575 == 1) {
            var5 = var4.field1559 - field1483 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1561 - field1499 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1562 - field1499 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(renderArea[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = field1485 - var4.field1578;
                  if(var9 > 32) {
                     var4.field1570 = 1;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field1570 = 2;
                     var9 = -var9;
                  }

                  var4.field1573 = (var4.field1566 - field1477 << 8) / var9;
                  var4.field1582 = (var4.field1577 - field1477 << 8) / var9;
                  var4.field1574 = (var4.field1568 - field1486 << 8) / var9;
                  var4.field1576 = (var4.field1569 - field1486 << 8) / var9;
                  field1512[field1505++] = var4;
               }
            }
         } else if(var4.field1575 == 2) {
            var5 = var4.field1561 - field1499 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1559 - field1483 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1560 - field1483 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(renderArea[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = field1477 - var4.field1566;
                  if(var9 > 32) {
                     var4.field1570 = 3;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field1570 = 4;
                     var9 = -var9;
                  }

                  var4.field1571 = (var4.field1578 - field1485 << 8) / var9;
                  var4.field1572 = (var4.field1579 - field1485 << 8) / var9;
                  var4.field1574 = (var4.field1568 - field1486 << 8) / var9;
                  var4.field1576 = (var4.field1569 - field1486 << 8) / var9;
                  field1512[field1505++] = var4;
               }
            }
         } else if(var4.field1575 == 4) {
            var5 = var4.field1568 - field1486;
            if(var5 > 128) {
               var6 = var4.field1561 - field1499 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1562 - field1499 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var8 = var4.field1559 - field1483 + 25;
                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field1560 - field1483 + 25;
                  if(var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label194:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if(renderArea[var11][var12]) {
                           var10 = true;
                           break label194;
                        }
                     }
                  }

                  if(var10) {
                     var4.field1570 = 5;
                     var4.field1571 = (var4.field1578 - field1485 << 8) / var5;
                     var4.field1572 = (var4.field1579 - field1485 << 8) / var5;
                     var4.field1573 = (var4.field1566 - field1477 << 8) / var5;
                     var4.field1582 = (var4.field1577 - field1477 << 8) / var5;
                     field1512[field1505++] = var4;
                  }
               }
            }
         }
      }

   }
}
