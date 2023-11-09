using RefactoringExerciseI.Enums;

namespace RefactoringExerciseI.Inventory.Handlers
{
    class SulfurasHandHandler : ItemUpdateHandler
    {
        public override void UpdateItem(Item item)
        {
            if (ItemNames.SulfurasHand == item.Name) {
                return;
            }
            next?.UpdateItem(item);
        }
    }
}