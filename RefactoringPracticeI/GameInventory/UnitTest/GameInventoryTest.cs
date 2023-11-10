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

            GameInventory inventory = new(Items);
            inventory.UpdateQuality();

            Assert.That(Items[0].Name, Is.EqualTo(ItemNames.BackstagePasses));
            Assert.That(Items[0].Quality, Is.EqualTo(expectedQuality));
            Assert.That(Items[0].SellIn, Is.EqualTo(expectedSellIn));
        }

        [Test]
        public void Sulfuras()
        {
            // ToDo
        }

        [Test]
        public void AgedBrie()
        {
            // ToDo
        }

    }
}