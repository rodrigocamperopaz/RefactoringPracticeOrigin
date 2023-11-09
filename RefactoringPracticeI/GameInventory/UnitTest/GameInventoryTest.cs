using NUnit.Framework;
using RefactoringExerciseI.Enums;
using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI.UnitTest
{
    [TestFixture]
    public class GameInventoryTest
    {
        private Item ItemProvider(string itemName, int startingSellIn, int startingQuality)
        {
            return new Item {Name = itemName, SellIn = startingSellIn, Quality = startingQuality};
        }

        [Test]
        [TestCase (5, 0, 4, 3)]
        [TestCase (0, 45, -1, 0)]
        [TestCase (5, 50, 4, 50)]
        [TestCase (8, 0, 7, 2)]
        public void BackstagePasses(int startingSellIn, int startingQuality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> Items = new List<Item>
            {
                ItemProvider(ItemNames.BackstagePasses, startingSellIn, startingQuality)
            };
            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Name, Is.EqualTo(ItemNames.BackstagePasses));
            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase (0, 0, 0, 0)]
        [TestCase (5, 50, 5, 50)]
        [TestCase (-1, 40, -1, 40)]
        public void Sulfuras(int startingSellIn, int startingQuality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> Items = new List<Item>
            {
                ItemProvider(ItemNames.SulfurasHand, startingSellIn, startingQuality)
            };
            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Name, Is.EqualTo(ItemNames.SulfurasHand));
            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        [TestCase (0, 0, -1, 2)]
        [TestCase (5, 50, 4, 50)]
        [TestCase (-1, 40, -2, 42)]
        public void AgedBrie(int startingSellIn, int startingQuality, int expectedSellIn, int expectedQuality)
        {
            IList<Item> Items = new List<Item>
            {
                ItemProvider(ItemNames.AgedBrie, startingSellIn, startingQuality)
            };
            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Name, Is.EqualTo(ItemNames.AgedBrie));
            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }
    }
}