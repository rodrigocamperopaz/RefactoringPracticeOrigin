using NUnit.Framework;
using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI.UnitTest
{
    [TestFixture]
    public class GameInventoryTest
    {
        [Test]
        [TestCase(5, 0, 4, 3)]
        [TestCase(0, 45, -1, 0)]
        [TestCase(5, 50, 4, 50)]
        [TestCase(8, 0, 7, 2)]
        public void BackstagePasses(int startingSellIn, int startingQuality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> Items = new List<Item>();
            ItemFactory backstagePassesFactory = new BackstagePassesFactory();

            Items.Add(backstagePassesFactory.CreateItem("Backstage passes to a Pokemon Gym concert", startingSellIn, startingQuality));

            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase(10, 20, 10, 20)]
        [TestCase(20, 45, 20, 45)]
        [TestCase(5, 50, 5, 50)]
        [TestCase(7, 0, 7, 0)]
        public void Sulfuras(int startingSellIn, int startingQuality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> Items = new List<Item>();
            ItemFactory sulfurasFactory = new SulfurasFactory();

            Items.Add(sulfurasFactory.CreateItem("Sulfuras, Hand of Ragnaros", startingSellIn, startingQuality));

            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase(0, 0, -1, 2)]
        [TestCase(5, 50, 4, 50)]
        [TestCase(-1, 40, -2, 42)]
        public void AgedBrie(int startingSellIn, int startingQuality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> Items = new List<Item>();
            ItemFactory agedBriefFactory = new AgedBriefFactory();

            Items.Add(agedBriefFactory.CreateItem("Aged Brie", startingSellIn, startingQuality));

            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase(2, 5, 1, 4)]
        [TestCase(13, 60, 12, 59)]
        [TestCase(0, 16, -1, 14)]
        public void CommonItem(int startingSellIn, int startingQuality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> Items = new List<Item>();
            ItemFactory commonFactory = new CommonFactory();

            Items.Add(commonFactory.CreateItem("+5 Dexterity Vest", startingSellIn, startingQuality));

            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

    }
}