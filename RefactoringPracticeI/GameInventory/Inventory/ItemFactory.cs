

namespace RefactoringExerciseI.Inventory
{
    public interface ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality);
    }
}
