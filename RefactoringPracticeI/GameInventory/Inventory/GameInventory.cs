

using GameInventory.Games;

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
                var itemGame = _items[index];

                if (!itemGame.IsValid()) continue;

                GameCreator gameBase = new(itemGame.Name);
                gameBase.UpdateQualityAndSell(itemGame);

            }
        }
    }
}
