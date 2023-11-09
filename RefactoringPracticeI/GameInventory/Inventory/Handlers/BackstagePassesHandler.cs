using RefactoringExerciseI.Enums;

namespace RefactoringExerciseI.Inventory.Handlers
{
    class BackstagePassesHandler : ItemUpdateHandler
    {
        public override void UpdateItem(Item item)
        {
            if (ItemNames.BackstagePasses == item.Name) {
                if (item.Quality < 50)
                {
                    item.Quality++;
                }

                if (item.SellIn < 11 && item.Quality < 50)
                {
                    item.Quality++;
                }

                if (item.SellIn < 6 && item.Quality < 50)
                {
                    item.Quality++;
                }

                item.SellIn--;

                if (item.SellIn < 0 )
                {
                    item.Quality = 0;
                }

                return;
            }
            next?.UpdateItem(item);
        }
    }
}