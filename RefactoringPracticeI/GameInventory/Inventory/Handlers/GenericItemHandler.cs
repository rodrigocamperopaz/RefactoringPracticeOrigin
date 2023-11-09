namespace RefactoringExerciseI.Inventory.Handlers
{
    class GenericItemHandler : ItemUpdateHandler
    {
        public override void UpdateItem(Item item)
        {
            if (item.Quality > 0)
            {
                item.Quality--;
            }

            item.SellIn--;

            if (item.SellIn < 0 && item.Quality > 0)
            {
                item.Quality--;
            }
        }
    }
}