using RefactoringExerciseI.Enums;

namespace RefactoringExerciseI.Inventory.Handlers
{
    class AgedBrieHandler : ItemUpdateHandler
    {
        public override void UpdateItem(Item item)
        {
            if (ItemNames.AgedBrie == item.Name) {
                if (item.Quality < 50)
                {
                    item.Quality++;
                }

                item.SellIn--;

                if (item.SellIn < 0 && item.Quality < 50)
                {
                    item.Quality++;
                }

                return;
            }
            next?.UpdateItem(item);
        }
    }
}