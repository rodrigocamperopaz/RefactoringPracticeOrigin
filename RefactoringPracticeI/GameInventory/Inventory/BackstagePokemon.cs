namespace RefactoringExerciseI.Inventory
{
    public class BackstagePokemon : IUpdate
    {
        private readonly Item _item;

        public BackstagePokemon (Item item)
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
            if( _item.SellIn < 10 && _item.Quality < 50 )
            {
                _item.Quality++;
            }
            if( _item.SellIn < 5 && _item.Quality < 50 )
            {
                _item.Quality++;
            }
            if( _item.SellIn < 0 )
            {
                _item.Quality = 0;
            }
            return _item;
        }
    }
}