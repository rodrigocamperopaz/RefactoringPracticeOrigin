
namespace RefactoringExerciseI.Inventory
{
    public class SulfurasFactory : ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality)
        {
            return new SulfurasItem { Name = Name, SellIn = SellIn, Quality = Quality };
        }
    }
}
