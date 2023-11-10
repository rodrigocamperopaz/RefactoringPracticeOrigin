namespace RefactoringExerciseI.Inventory
{
    public class GameInventory
    {
        private readonly IList<Item> _items;

        public GameInventory(IList<Item> Items)
        {
            _items = Items;
        }

        public void UpdateQuality()
        {
            for (var index = 0; index < _items.Count; index++)
            {
                Item result;
                Item item = _items[index];

                result = _items[index].Name switch
                {
                    "Aged Brie" => new AgedBrie(item).Update(),
                    "Backstage passes to a Pokemon Gym concert" => new BackstagePokemon(item).Update(),
                    "Sulfuras, Hand of Ragnaros" => _items[index],
                    _ => new Default(item).Update(),
                };
                _items[index].Quality = result.Quality;
                _items[index].SellIn = result.SellIn;
            }
        }

    }
}
