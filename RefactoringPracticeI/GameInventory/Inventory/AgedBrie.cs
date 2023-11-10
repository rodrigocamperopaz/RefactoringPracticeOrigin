namespace RefactoringExerciseI.Inventory
{
    public class AgedBrie : IUpdate
    {
        private readonly Item _item;

        public AgedBrie (Item item)
        {
            _item = item;
        }

        public Item Update ()
        {
            if( _item.Quality < 50 )
            {
                _item.Quality++;
            }

            _item.SellIn--;

            if( _item.SellIn < 0 && _item.Quality < 50)
            {
                _item.Quality++;
            }

            return _item;
        }
    }
}