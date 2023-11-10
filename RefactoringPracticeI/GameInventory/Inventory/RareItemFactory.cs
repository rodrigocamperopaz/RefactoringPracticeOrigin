
namespace RefactoringExerciseI.Inventory
{
    public class RareItemFactory : ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality)
        {
            return new RareItem { Name = Name, SellIn = SellIn, Quality = Quality };
        }
    }
}
