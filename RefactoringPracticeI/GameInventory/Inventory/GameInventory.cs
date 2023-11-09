using ApprovalUtilities.Utilities;

namespace RefactoringExerciseI.Inventory
{
    public class GameInventory
    {
        private readonly IList<Item> _items;
        private readonly IHandlerItem _handler;

        public GameInventory(IList<Item> Items, IHandlerItem Handler)
        {
            _items = Items;
            _handler = Handler;
        }

        public void UpdateQuality()
        {
            _items.ForEach(item => UpdateItemQuality(item));
        }

        private void UpdateItemQuality(Item item)
        {
            if (item == null)
                return;

            _handler.UpdateQuality(item);
        }
    }
}
