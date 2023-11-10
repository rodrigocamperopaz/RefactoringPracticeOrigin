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

            ItemFactory sulfurasFactory = new SulfurasFactory();
            ItemFactory agedBriefFactory = new AgedBriefFactory();
            ItemFactory backstagePassesFactory = new BackstagePassesFactory();
            ItemFactory commonFactory = new CommonFactory();

            IList<Item> Items = new List<Item>();

            Items.Add(commonFactory.CreateItem("+5 Dexterity Vest", 10, 20));
            Items.Add(agedBriefFactory.CreateItem("Aged Brie", 2, 0));
            Items.Add(commonFactory.CreateItem("Elixir of the Mongoose", 5, 7));
            Items.Add(sulfurasFactory.CreateItem("Sulfuras, Hand of Ragnaros", 0, 80));
            Items.Add(commonFactory.CreateItem("Sulfuras, Hand of sRagnaros", -1, 80));
            Items.Add(backstagePassesFactory.CreateItem("Backstage passes to a Pokemon Gym concert", 15, 20));
            Items.Add(backstagePassesFactory.CreateItem("Backstage passes to a Pokemon Gym concert", 10, 49));
            Items.Add(backstagePassesFactory.CreateItem("Backstage passes to a Pokemon Gym concert", 5, 49));
            Items.Add(commonFactory.CreateItem("Conjured Mana Cake", 3, 6));

            GameInventory app = new GameInventory(Items);


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
        }
    }
}