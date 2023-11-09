package org.assuresoft.utils;

public final class TestConstants {
  private TestConstants() {
  }

  public static final String EXPECTED_PROGRAM_OUTPUT = """
      Here we are!
      -------- day 0 --------
      Item{name='+5 Dexterity Vest', sellIn=10, quality=20}
      
      Item{name='Aged Brie', sellIn=2, quality=0}
      
      Item{name='Elixir of the Mongoose', sellIn=5, quality=7}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-1, quality=80}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=15, quality=20}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=10, quality=49}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=5, quality=49}
      
      Item{name='Conjured Mana Cake', sellIn=3, quality=6}
      
      -------- day 1 --------
      Item{name='+5 Dexterity Vest', sellIn=9, quality=19}
      
      Item{name='Aged Brie', sellIn=1, quality=1}
      
      Item{name='Elixir of the Mongoose', sellIn=4, quality=6}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-2, quality=78}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=14, quality=21}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=9, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=4, quality=50}
      
      Item{name='Conjured Mana Cake', sellIn=2, quality=5}
      
      -------- day 2 --------
      Item{name='+5 Dexterity Vest', sellIn=8, quality=18}
      
      Item{name='Aged Brie', sellIn=0, quality=2}
      
      Item{name='Elixir of the Mongoose', sellIn=3, quality=5}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-3, quality=76}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=13, quality=22}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=8, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=3, quality=50}
      
      Item{name='Conjured Mana Cake', sellIn=1, quality=4}
      
      -------- day 3 --------
      Item{name='+5 Dexterity Vest', sellIn=7, quality=17}
      
      Item{name='Aged Brie', sellIn=-1, quality=4}
      
      Item{name='Elixir of the Mongoose', sellIn=2, quality=4}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-4, quality=74}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=12, quality=23}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=7, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=2, quality=50}
      
      Item{name='Conjured Mana Cake', sellIn=0, quality=3}
      
      -------- day 4 --------
      Item{name='+5 Dexterity Vest', sellIn=6, quality=16}
      
      Item{name='Aged Brie', sellIn=-2, quality=6}
      
      Item{name='Elixir of the Mongoose', sellIn=1, quality=3}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-5, quality=72}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=11, quality=24}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=6, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=1, quality=50}
      
      Item{name='Conjured Mana Cake', sellIn=-1, quality=1}
      
      -------- day 5 --------
      Item{name='+5 Dexterity Vest', sellIn=5, quality=15}
      
      Item{name='Aged Brie', sellIn=-3, quality=8}
      
      Item{name='Elixir of the Mongoose', sellIn=0, quality=2}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-6, quality=70}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=10, quality=25}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=5, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=0, quality=50}
      
      Item{name='Conjured Mana Cake', sellIn=-2, quality=0}
      
      -------- day 6 --------
      Item{name='+5 Dexterity Vest', sellIn=4, quality=14}
      
      Item{name='Aged Brie', sellIn=-4, quality=10}
      
      Item{name='Elixir of the Mongoose', sellIn=-1, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-7, quality=68}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=9, quality=27}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=4, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-1, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-3, quality=0}
      
      -------- day 7 --------
      Item{name='+5 Dexterity Vest', sellIn=3, quality=13}
      
      Item{name='Aged Brie', sellIn=-5, quality=12}
      
      Item{name='Elixir of the Mongoose', sellIn=-2, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-8, quality=66}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=8, quality=29}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=3, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-2, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-4, quality=0}
      
      -------- day 8 --------
      Item{name='+5 Dexterity Vest', sellIn=2, quality=12}
      
      Item{name='Aged Brie', sellIn=-6, quality=14}
      
      Item{name='Elixir of the Mongoose', sellIn=-3, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-9, quality=64}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=7, quality=31}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=2, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-3, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-5, quality=0}
      
      -------- day 9 --------
      Item{name='+5 Dexterity Vest', sellIn=1, quality=11}
      
      Item{name='Aged Brie', sellIn=-7, quality=16}
      
      Item{name='Elixir of the Mongoose', sellIn=-4, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-10, quality=62}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=6, quality=33}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=1, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-4, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-6, quality=0}
      
      -------- day 10 --------
      Item{name='+5 Dexterity Vest', sellIn=0, quality=10}
      
      Item{name='Aged Brie', sellIn=-8, quality=18}
      
      Item{name='Elixir of the Mongoose', sellIn=-5, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-11, quality=60}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=5, quality=35}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=0, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-5, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-7, quality=0}
      
      -------- day 11 --------
      Item{name='+5 Dexterity Vest', sellIn=-1, quality=8}
      
      Item{name='Aged Brie', sellIn=-9, quality=20}
      
      Item{name='Elixir of the Mongoose', sellIn=-6, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-12, quality=58}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=4, quality=38}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-1, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-6, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-8, quality=0}
      
      -------- day 12 --------
      Item{name='+5 Dexterity Vest', sellIn=-2, quality=6}
      
      Item{name='Aged Brie', sellIn=-10, quality=22}
      
      Item{name='Elixir of the Mongoose', sellIn=-7, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-13, quality=56}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=3, quality=41}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-2, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-7, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-9, quality=0}
      
      -------- day 13 --------
      Item{name='+5 Dexterity Vest', sellIn=-3, quality=4}
      
      Item{name='Aged Brie', sellIn=-11, quality=24}
      
      Item{name='Elixir of the Mongoose', sellIn=-8, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-14, quality=54}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=2, quality=44}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-3, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-8, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-10, quality=0}
      
      -------- day 14 --------
      Item{name='+5 Dexterity Vest', sellIn=-4, quality=2}
      
      Item{name='Aged Brie', sellIn=-12, quality=26}
      
      Item{name='Elixir of the Mongoose', sellIn=-9, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-15, quality=52}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=1, quality=47}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-4, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-9, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-11, quality=0}
      
      -------- day 15 --------
      Item{name='+5 Dexterity Vest', sellIn=-5, quality=0}
      
      Item{name='Aged Brie', sellIn=-13, quality=28}
      
      Item{name='Elixir of the Mongoose', sellIn=-10, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-16, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=0, quality=50}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-5, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-10, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-12, quality=0}
      
      -------- day 16 --------
      Item{name='+5 Dexterity Vest', sellIn=-6, quality=0}
      
      Item{name='Aged Brie', sellIn=-14, quality=30}
      
      Item{name='Elixir of the Mongoose', sellIn=-11, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-17, quality=48}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-1, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-6, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-11, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-13, quality=0}
      
      -------- day 17 --------
      Item{name='+5 Dexterity Vest', sellIn=-7, quality=0}
      
      Item{name='Aged Brie', sellIn=-15, quality=32}
      
      Item{name='Elixir of the Mongoose', sellIn=-12, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-18, quality=46}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-2, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-7, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-12, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-14, quality=0}
      
      -------- day 18 --------
      Item{name='+5 Dexterity Vest', sellIn=-8, quality=0}
      
      Item{name='Aged Brie', sellIn=-16, quality=34}
      
      Item{name='Elixir of the Mongoose', sellIn=-13, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-19, quality=44}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-3, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-8, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-13, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-15, quality=0}
      
      -------- day 19 --------
      Item{name='+5 Dexterity Vest', sellIn=-9, quality=0}
      
      Item{name='Aged Brie', sellIn=-17, quality=36}
      
      Item{name='Elixir of the Mongoose', sellIn=-14, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-20, quality=42}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-4, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-9, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-14, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-16, quality=0}
      
      -------- day 20 --------
      Item{name='+5 Dexterity Vest', sellIn=-10, quality=0}
      
      Item{name='Aged Brie', sellIn=-18, quality=38}
      
      Item{name='Elixir of the Mongoose', sellIn=-15, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-21, quality=40}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-5, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-10, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-15, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-17, quality=0}
      
      -------- day 21 --------
      Item{name='+5 Dexterity Vest', sellIn=-11, quality=0}
      
      Item{name='Aged Brie', sellIn=-19, quality=40}
      
      Item{name='Elixir of the Mongoose', sellIn=-16, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-22, quality=38}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-6, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-11, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-16, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-18, quality=0}
      
      -------- day 22 --------
      Item{name='+5 Dexterity Vest', sellIn=-12, quality=0}
      
      Item{name='Aged Brie', sellIn=-20, quality=42}
      
      Item{name='Elixir of the Mongoose', sellIn=-17, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-23, quality=36}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-7, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-12, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-17, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-19, quality=0}
      
      -------- day 23 --------
      Item{name='+5 Dexterity Vest', sellIn=-13, quality=0}
      
      Item{name='Aged Brie', sellIn=-21, quality=44}
      
      Item{name='Elixir of the Mongoose', sellIn=-18, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-24, quality=34}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-8, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-13, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-18, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-20, quality=0}
      
      -------- day 24 --------
      Item{name='+5 Dexterity Vest', sellIn=-14, quality=0}
      
      Item{name='Aged Brie', sellIn=-22, quality=46}
      
      Item{name='Elixir of the Mongoose', sellIn=-19, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-25, quality=32}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-9, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-14, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-19, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-21, quality=0}
      
      -------- day 25 --------
      Item{name='+5 Dexterity Vest', sellIn=-15, quality=0}
      
      Item{name='Aged Brie', sellIn=-23, quality=48}
      
      Item{name='Elixir of the Mongoose', sellIn=-20, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-26, quality=30}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-10, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-15, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-20, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-22, quality=0}
      
      -------- day 26 --------
      Item{name='+5 Dexterity Vest', sellIn=-16, quality=0}
      
      Item{name='Aged Brie', sellIn=-24, quality=50}
      
      Item{name='Elixir of the Mongoose', sellIn=-21, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-27, quality=28}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-11, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-16, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-21, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-23, quality=0}
      
      -------- day 27 --------
      Item{name='+5 Dexterity Vest', sellIn=-17, quality=0}
      
      Item{name='Aged Brie', sellIn=-25, quality=50}
      
      Item{name='Elixir of the Mongoose', sellIn=-22, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-28, quality=26}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-12, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-17, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-22, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-24, quality=0}
      
      -------- day 28 --------
      Item{name='+5 Dexterity Vest', sellIn=-18, quality=0}
      
      Item{name='Aged Brie', sellIn=-26, quality=50}
      
      Item{name='Elixir of the Mongoose', sellIn=-23, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-29, quality=24}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-13, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-18, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-23, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-25, quality=0}
      
      -------- day 29 --------
      Item{name='+5 Dexterity Vest', sellIn=-19, quality=0}
      
      Item{name='Aged Brie', sellIn=-27, quality=50}
      
      Item{name='Elixir of the Mongoose', sellIn=-24, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-30, quality=22}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-14, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-19, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-24, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-26, quality=0}
      
      -------- day 30 --------
      Item{name='+5 Dexterity Vest', sellIn=-20, quality=0}
      
      Item{name='Aged Brie', sellIn=-28, quality=50}
      
      Item{name='Elixir of the Mongoose', sellIn=-25, quality=0}
      
      Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}
      
      Item{name='Sulfuras, Hand of sRagnaros', sellIn=-31, quality=20}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-15, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-20, quality=0}
      
      Item{name='Backstage passes to a Pokemon Gym concert', sellIn=-25, quality=0}
      
      Item{name='Conjured Mana Cake', sellIn=-27, quality=0}
      
      """;
}
