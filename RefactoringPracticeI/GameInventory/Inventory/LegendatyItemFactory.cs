
namespace RefactoringExerciseI.Inventory
{
    public class LegendatyItemFactory : ItemFactory
    {
        public Item CreateItem(string Name, int SellIn, int Quality)
        {
            return new LegendaryItem { Name = Name, SellIn = SellIn, Quality = Quality };
        }
    }
}
