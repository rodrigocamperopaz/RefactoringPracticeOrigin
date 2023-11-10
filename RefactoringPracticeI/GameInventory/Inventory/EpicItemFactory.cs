
namespace RefactoringExerciseI.Inventory
{
    public class EpicItemFactory : ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality)
        {
            return new RareItem { Name = Name, SellIn = SellIn, Quality = Quality };
        }
    }
}
