
namespace RefactoringExerciseI.Inventory
{
    public class BackstagePassesFactory : ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality)
        {
            return new BackstagePassesItem { Name = Name, SellIn = SellIn, Quality = Quality };
        }
    }
}
