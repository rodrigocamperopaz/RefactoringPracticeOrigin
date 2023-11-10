
namespace RefactoringExerciseI.Inventory
{
    public class GameInventory
    {
        private readonly IList<Item> _items;

        public GameInventory(IList<Item> Items)
        {
            _items = Items;
        }

        public void UpdateQuality()
        {
            Visitor visitor = new ItemDayVisitor();
            for (var index = 0; index < _items.Count; index++)
            {
                _items[index].AcceptDayVisitor(visitor);
            }
        }
    }
}
