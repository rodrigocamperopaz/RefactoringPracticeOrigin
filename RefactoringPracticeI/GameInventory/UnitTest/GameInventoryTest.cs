using GameInventory.Inventory.Constans;
using NUnit.Framework;
using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI.UnitTest
{
    [TestFixture]
    public class GameInventoryTest
    {
        [Test]
        public void BackstagePasses()
        {
            IList<Item> Items = new List<Item> { new Item { Name = null, SellIn = 15, Quality = 20 },
                                                 new Item { Name = "", SellIn = -1, Quality = -10 },
                                                 new Item { Name = "Backstage passes to a Pokemon Gym concert", SellIn = 1000, Quality = 1000 }};
            
            Inventory.GameInventory app = new(Items);
            app.UpdateQuality();

            Assert.That(Items[0].Name, Is.Null);
            Assert.That(Items[0].Quality, Is.EqualTo(20));
            Assert.That(Items[0].SellIn, Is.EqualTo(15));

            Assert.That(Items[1].Name, Is.Empty);
            Assert.That(Items[1].Quality, Is.EqualTo(-10));
            Assert.That(Items[1].SellIn, Is.EqualTo(-1));

            Assert.That(Items[2].Name, Is. EqualTo(GameName.BackstagePasses));
            Assert.That(Items[2].Quality, Is.EqualTo(1000));
            Assert.That(Items[2].SellIn, Is.EqualTo(999));
        }

        [Test]
        public void Sulfuras()
        {
            IList<Item> Items = new List<Item> { new Item { Name = "Sulfuras, Hand of Ragnaros", SellIn = 0, Quality = 1 },
                                                 new Item { Name = "Sulfuras, Hand of Ragnaros", SellIn = -10, Quality = -10 },
                                                 new Item { Name = "Sulfuras, Hand of Ragnaros", SellIn = 100, Quality = 100 }};

            Inventory.GameInventory app = new(Items);
            app.UpdateQuality();

            Assert.That(Items[0].Name, Is.EqualTo(GameName.Sulfuras));
            Assert.That(Items[0].Quality, Is.EqualTo(1));
            Assert.That(Items[0].SellIn, Is.EqualTo(0));

            Assert.That(Items[1].Name, Is.EqualTo(GameName.Sulfuras));
            Assert.That(Items[1].Quality, Is.EqualTo(-10));
            Assert.That(Items[1].SellIn, Is.EqualTo(-10));

            Assert.That(Items[2].Name, Is.EqualTo(GameName.Sulfuras));
            Assert.That(Items[2].Quality, Is.EqualTo(100));
            Assert.That(Items[2].SellIn, Is.EqualTo(100));
        }

        [Test]
        public void AgedBrie()
        {
            IList<Item> Items = new List<Item> { new Item { Name = "Aged Brie", SellIn = 6, Quality = 500000 },
                                                 new Item { Name = "Aged Brie", SellIn = 0, Quality = -100 },
                                                 new Item { Name = "Aged Brie", SellIn = 123456, Quality = 1 }};

            Inventory.GameInventory app = new(Items);
            app.UpdateQuality();

            Assert.That(Items[0].Name, Is.EqualTo(GameName.AgedBrie));
            Assert.That(Items[0].Quality, Is.EqualTo(500000));
            Assert.That(Items[0].SellIn, Is.EqualTo(5));

            Assert.That(Items[1].Name, Is.EqualTo(GameName.AgedBrie));
            Assert.That(Items[1].Quality, Is.EqualTo(-98));
            Assert.That(Items[1].SellIn, Is.EqualTo(-1));

            Assert.That(Items[2].Name, Is.EqualTo(GameName.AgedBrie));
            Assert.That(Items[2].Quality, Is.EqualTo(2));
            Assert.That(Items[2].SellIn, Is.EqualTo(123455));
        }

        [Test]
        public void Foo()
        {
            IList<Item> Items = new List<Item> { new Item { Name = "foo", SellIn = 0, Quality = 0 },
                                                 new Item { Name = "pokemon", SellIn = 5, Quality = 49 },
                                                 new Item { Name = "Call Of Duty", SellIn = -1, Quality = 10 }};

            Inventory.GameInventory app = new(Items);
            app.UpdateQuality();

            Assert.That(Items[0].Name, Is.EqualTo("foo"));
            Assert.That(Items[0].Quality, Is.EqualTo(0));
            Assert.That(Items[0].SellIn, Is.EqualTo(-1));

            Assert.That(Items[1].Name, Is.EqualTo("pokemon"));
            Assert.That(Items[1].Quality, Is.EqualTo(48));
            Assert.That(Items[1].SellIn, Is.EqualTo(4));

            Assert.That(Items[2].Name, Is.EqualTo("Call Of Duty"));
            Assert.That(Items[2].Quality, Is.EqualTo(8));
            Assert.That(Items[2].SellIn, Is.EqualTo(-2));
        }
    }
}