using NUnit.Framework;
using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI.UnitTest
{

    [TestFixture]
    public class GameInventoryTest
    {
        [Test]
        [TestCase(5, 3, 4, 6)]
        [TestCase(10, 10, 9, 12)]
        [TestCase(0, 50, -1, 0)]
        [TestCase(14, 10, 13, 11)]
        public void BackstagePasses(int sellIn, int quality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> items = new List<Item> { new () { Name = "Backstage passes to a Pokemon Gym concert", SellIn = sellIn, Quality = quality } };
            GameInventory _app = new(items);
            _app.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo("Backstage passes to a Pokemon Gym concert"));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
        }

        [Test]
        [TestCase(0, 50, 0, 50)]
        [TestCase(14, 10, 14, 10)]
        [TestCase(0, 1, 0, 1)]
        public void Sulfuras(int sellIn, int quality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> items = new List<Item> { new () { Name = "Sulfuras, Hand of Ragnaros", SellIn = sellIn, Quality = quality } };
            GameInventory _app = new(items);
            _app.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo("Sulfuras, Hand of Ragnaros"));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
        }

        [Test]
        [TestCase(0, 50, -1, 50)]
        [TestCase(-1, 10, -2, 12)]
        [TestCase(0, 4, -1, 6)]
        public void AgedBrie(int sellIn, int quality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> items = new List<Item> { new () { Name = "Aged Brie", SellIn = sellIn, Quality = quality } };
            GameInventory _app = new(items);
            _app.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo("Aged Brie"));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
        }

        [Test]
        [TestCase(0, 50, -1, 48)]
        [TestCase(1, 10, 0, 9)]
        [TestCase(4, 4, 3, 3)]
        public void Default(int sellIn, int quality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> items = new List<Item> { new () { Name = "Something", SellIn = sellIn, Quality = quality } };
            GameInventory _app = new(items);
            _app.UpdateQuality();

            Assert.That(items[0].Name, Is.EqualTo("Something"));
            Assert.That(items[0].SellIn, Is.EqualTo(expectedSellIn));
            Assert.That(items[0].Quality, Is.EqualTo(expectedQuality));
        }
    }
}