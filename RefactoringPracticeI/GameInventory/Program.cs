using System;
using System.Collections.Generic;
using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI
{

    public static class Program
    {
        public static void Main()
        {
            Console.WriteLine("Here we are!");

            ItemFactory legendaryItemFactory = new LegendatyItemFactory();
            ItemFactory epicItemFactory = new EpicItemFactory();
            ItemFactory rareItemFactory = new RareItemFactory();
            ItemFactory commonItemFactory = new CommonItemFactory();

            IList<Item> Items = new List<Item>();

            Items.Add(commonItemFactory.CreateItem("+5 Dexterity Vest", 10, 20));
            Items.Add(commonItemFactory.CreateItem("Aged Brie", 2, 0));
            Items.Add(commonItemFactory.CreateItem("Elixir of the Mongoose", 5, 7));
            Items.Add(legendaryItemFactory.CreateItem("Sulfuras, Hand of Ragnaros", 0, 80));
            Items.Add(commonItemFactory.CreateItem("Sulfuras, Hand of sRagnaros", -1, 80));
            Items.Add(rareItemFactory.CreateItem("Backstage passes to a Pokemon Gym concert", 15, 20));
            Items.Add(rareItemFactory.CreateItem("Backstage passes to a Pokemon Gym concert", 10, 49));
            Items.Add(rareItemFactory.CreateItem("Backstage passes to a Pokemon Gym concert", 5, 49));
            Items.Add(epicItemFactory.CreateItem("Conjured Mana Cake", 3, 6));

            var app = new GameInventory(Items);


            for (int index = 0; index < 31; index++)
            {
                Console.WriteLine($"-------- day {index} --------");
                Console.WriteLine("name, sellIn, quality");
                for (int pivot = 0; pivot < Items.Count; pivot++)
                {
                    Console.WriteLine(Items[pivot]);
                }
                Console.WriteLine("");
                app.UpdateQuality();
            }

            Console.WriteLine("Press a key to exit...");
            Console.ReadLine();
        }
    }
}