namespace RefactoringExerciseI.Inventory
{
    public class HandlerStandardItem : IHandlerItem
    {
        private IHandlerItem? _nextHandler;

        public IHandlerItem? NextHandler { get; }

        public void SetNext(IHandlerItem NextHandler)
        {
            _nextHandler = NextHandler;
        }

        public void UpdateQuality(Item item)
        {
            if (item == null)
                return;

            if (ItemNames.Standars.Contains(item.Name))
            {
                if (item.Quality > 0)
                {
                    item.Quality--;
                }
                item.SellIn--;
                if (item.SellIn < 0 && item.Quality > 0)
                {
                    item.Quality--;
                }
                return;
            }
            _nextHandler?.UpdateQuality(item);
        }
    }
}
