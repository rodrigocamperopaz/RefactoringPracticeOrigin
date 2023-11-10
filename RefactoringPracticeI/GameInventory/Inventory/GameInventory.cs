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
            foreach (Item item in _items)
            {
                Item result;

                result = item.Name switch
                {
                    "Aged Brie" => new AgedBrie(item).Update(),
                    "Backstage passes to a Pokemon Gym concert" => new BackstagePokemon(item).Update(),
                    "Sulfuras, Hand of Ragnaros" => item,
                    _ => new Default(item).Update(),
                };
                item.Quality = result.Quality;
                item.SellIn = result.SellIn;
            }
        }

    }
}
