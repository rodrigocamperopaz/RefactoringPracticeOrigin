namespace RefactoringExerciseI.Inventory
{
    public class HandlerAgedBrie : IHandlerItem 
    {
        private IHandlerItem? _nextHandler;

        public IHandlerItem? NextHandler { get; }

        public void SetNext(IHandlerItem NextHandler)
        {
            _nextHandler = NextHandler;
        }

        public void UpdateQuality (Item item)
        {
            if(item == null)
               return;

            if(item.Name == ItemNames.AgedBrie) {
                if(item.Quality < 50)
                {
                    item.Quality++;
                }
                item.SellIn--;
                if(item.SellIn < 0 && item.Quality < 50)
                {
                    item.Quality++;
                }
            }
            _nextHandler?.UpdateQuality(item);
        }
    }
}
