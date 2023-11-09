using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI
{
    public static class Program
    {
        public static void Main()
        {
            Console.WriteLine("Here we are!");

            IList<Item> Items = new List<Item>{
                new Item {Name = ItemNames.DexterityVest, SellIn = 10, Quality = 20},
                new Item {Name = ItemNames.AgedBrie, SellIn = 2, Quality = 0},
                new Item {Name = ItemNames.ElixirOfTheMongoose, SellIn = 5, Quality = 7},
                new Item {Name = ItemNames.Sulfuras, SellIn = 0, Quality = 80},
                new Item {Name = "Sulfuras, Hand of sRagnaros", SellIn = -1, Quality = 80},
                new Item {Name = ItemNames.BackstagePasses, SellIn = 15, Quality = 20},
                new Item {Name = ItemNames.BackstagePasses, SellIn = 10, Quality = 49},
                new Item {Name = ItemNames.BackstagePasses, SellIn = 5, Quality = 49},
                new Item {Name = ItemNames.ConjuredManaCake, SellIn = 3, Quality = 6}
            };

            IHandlerFactory factory = new ItemNameHandlerFactory();
            IHandlerItem handler = factory.CreateHandler();

            var app = new GameInventory(Items, handler);


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