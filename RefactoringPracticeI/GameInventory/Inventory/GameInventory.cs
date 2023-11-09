using RefactoringExerciseI.Inventory.Handlers;

namespace RefactoringExerciseI.Inventory
{
    public class GameInventory
    {
        private readonly IList<Item> _items;
        private readonly ItemUpdateChain _updateChain;

        public GameInventory(IList<Item> Items)
        {
            _items = Items;
            _updateChain = new ItemUpdateChain();
        }

        public void UpdateQuality()
        {
            for (int index = 0; index < _items.Count; index++)
            {
                Item currentItem = _items[index];
                _updateChain.UpdateItem(currentItem);
            }
        }
    }
}
