using NUnit.Framework;
using NUnit.Framework.Interfaces;
using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI.UnitTest
{
    [TestFixture]
    public class GameInventoryTest
    {
        public static GameInventory GameInvetoryDataProvider(IList<Item> items)
        {
            IHandlerFactory factory = new ItemNameHandlerFactory();
            IHandlerItem handler = factory.CreateHandler();
            GameInventory GameInvetory = new(items, handler);
            return GameInvetory;
        }

        [Test]
        [TestCase(0, 0, 0, -1)]
        [TestCase(0, 20, 0, -1)]
        [TestCase(2, 50, 50, 1)]
        [TestCase(2, 50, 50, 1)]
        [TestCase(10, 49, 50, 9)]
        [TestCase(5, 20, 23, 4)]
        [TestCase(6, 20, 22, 5)]
        public void BackstagePasses(int sellIn, int quality, int expectedQuality, int expectedSellIn)
        {
            IList<Item> items = new List<Item>
            {
                new Item { Name = ItemNames.BackstagePasses, SellIn = sellIn, Quality = quality}
            };

            GameInventory gameInventory = GameInvetoryDataProvider(items);
            gameInventory.UpdateQuality();
            
            Assert.That(items[0].Name, Is.EqualTo(ItemNames.BackstagePasses));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase(6, 9, 9, 6)]
        public void Sulfuras(int sellIn, int quality, int expectedQuality, int expectedSellIn)
        {
            IList<Item> items = new List<Item>
            {
                new Item { Name = ItemNames.Sulfuras, SellIn = sellIn, Quality = quality}
            };
            GameInventory gameInventory = GameInvetoryDataProvider(items);
            gameInventory.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo(ItemNames.Sulfuras));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase(0, 49, 50, -1)]
        [TestCase(0, 48, 50, -1)]
        [TestCase(0, 50, 50, -1)]
        public void AgedBrie(int sellIn, int quality, int expectedQuality, int expectedSellIn)
        {
            IList<Item> items = new List<Item>
            {
                new Item { Name = ItemNames.AgedBrie, SellIn = sellIn, Quality = quality}
            };
            GameInventory gameInventory = GameInvetoryDataProvider(items);
            gameInventory.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo(ItemNames.AgedBrie));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase(0, 0, 0, -1)]
        [TestCase(0, 1, 0, -1)]
        [TestCase(0, 2, 0, -1)]
        [TestCase(1, 3, 2, 0)]
        public void DexterityVest(int sellIn, int quality, int expectedQuality, int expectedSellIn)
        {
            IList<Item> items = new List<Item>
            {
                new Item { Name = ItemNames.DexterityVest, SellIn = sellIn, Quality = quality}
            };
            GameInventory gameInventory = GameInvetoryDataProvider(items);
            gameInventory.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo(ItemNames.DexterityVest));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase(0, 0, 0, -1)]
        [TestCase(0, 1, 0, -1)]
        [TestCase(0, 2, 0, -1)]
        [TestCase(1, 3, 2, 0)]
        public void ConjuredManaCake(int sellIn, int quality, int expectedQuality, int expectedSellIn)
        {
            IList<Item> items = new List<Item>
            {
                new Item { Name = ItemNames.ConjuredManaCake, SellIn = sellIn, Quality = quality}
            };
            GameInventory gameInventory = GameInvetoryDataProvider(items);
            gameInventory.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo(ItemNames.ConjuredManaCake));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        public void InexistName()
        {
            IList<Item> items = new List<Item>
            {
                new Item { Name = "Foo", SellIn = 1, Quality = 1}
            };
            GameInventory gameInventory = GameInvetoryDataProvider(items);
            gameInventory.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo("Foo"));
            Assert.That(items[0].Quality, Is.EqualTo(1));
            Assert.That(items[0].SellIn, Is.EqualTo(1));
        }
    }
}