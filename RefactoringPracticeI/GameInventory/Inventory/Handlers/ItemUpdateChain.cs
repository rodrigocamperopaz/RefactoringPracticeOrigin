namespace RefactoringExerciseI.Inventory.Handlers
{

    public class ItemUpdateChain
    {
        private readonly ItemUpdateHandler _chain;

        public ItemUpdateChain()
        {
            // WIP: Generate chain with ItemUpdateHandlers
            SulfurasHandHandler sulfurasHandHandler = new();
            BackstagePassesHandler backstagePassesHandler = new();
            AgedBrieHandler agedBrieHandler = new();
            GenericItemHandler genericItemHandler = new();

            sulfurasHandHandler.Next = backstagePassesHandler;
            backstagePassesHandler.Next = agedBrieHandler;
            agedBrieHandler.Next = genericItemHandler;

            _chain = sulfurasHandHandler;
        }

        public void UpdateItem(Item item)
        {
            _chain.UpdateItem(item);
        }
    }

}