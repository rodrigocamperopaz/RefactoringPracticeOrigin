

namespace RefactoringExerciseI.Inventory
{
    public class CommonFactory : ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality)
        {
            return new CommonItem { Name = Name, SellIn = SellIn, Quality = Quality };
        }
    }
}
