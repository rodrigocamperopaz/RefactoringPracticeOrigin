namespace RefactoringExerciseI.Inventory
{
    public class Default : IUpdate
    {
        private readonly Item _item;

        public Default (Item item)
        {
            _item = item;
        }

        public Item Update ()
        {
            if ( _item.Quality > 0 )
            {
                _item.Quality--;
            }
            _item.SellIn--;
            if ( _item.SellIn < 0 && _item.Quality > 0 )
            {
                _item.Quality--;
            }
            return _item;
        }
    }
}