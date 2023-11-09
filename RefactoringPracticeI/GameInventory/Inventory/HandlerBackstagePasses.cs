namespace RefactoringExerciseI.Inventory
{
    public class HandlerBackstagePasses : IHandlerItem
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

            if (item.Name == ItemNames.BackstagePasses)
            {
                if (item.Quality < 50)
                {
                    item.Quality++;
                    if (item.SellIn < 11 && item.Quality < 50)
                    {
                        item.Quality++;
                    }
                    if (item.SellIn < 6 && item.Quality < 50)
                    {
                        item.Quality++;
                    }
                }
                item.SellIn--;
                if (item.SellIn < 0)
                {
                    item.Quality = 0;
                }
                return;
            }
            _nextHandler?.UpdateQuality(item);
        }
    }
}
