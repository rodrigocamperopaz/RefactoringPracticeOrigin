namespace RefactoringExerciseI.Inventory.Handlers
{
    abstract class ItemUpdateHandler
    {
        protected ItemUpdateHandler? next;

        public ItemUpdateHandler Next
        {
            set { next = value; }
        }

        public abstract void UpdateItem(Item item);
    }
}