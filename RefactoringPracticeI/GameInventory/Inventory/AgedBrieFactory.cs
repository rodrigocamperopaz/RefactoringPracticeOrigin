
namespace RefactoringExerciseI.Inventory
{
    public class AgedBriefFactory : ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality)
        {
            return new AgedBrie { Name = Name, SellIn = SellIn, Quality = Quality };
        }
    }
}
