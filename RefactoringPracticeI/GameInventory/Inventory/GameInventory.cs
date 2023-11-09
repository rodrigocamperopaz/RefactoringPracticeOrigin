using RefactoringExerciseI.Enums;

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
            for (int index = 0; index < _items.Count; index++)
            {
                Item currentItem = _items[index];
                if (currentItem.Name != ItemNames.AgedBrie && currentItem.Name != ItemNames.BackstagePasses)
                {
                    if (currentItem.Quality > 0 && currentItem.Name != ItemNames.SulfurasHand)
                    {
                        currentItem.Quality--;
                    }
                }
                else if (currentItem.Quality < 50)
                {
                    currentItem.Quality++;

                    if (currentItem.Name == ItemNames.BackstagePasses)
                    {
                        if (currentItem.SellIn < 11 && currentItem.Quality < 50)
                        {
                            currentItem.Quality++;
                        }

                        if (currentItem.SellIn < 6 && currentItem.Quality < 50)
                        {
                            currentItem.Quality++;
                        }
                    }
                }

                if (currentItem.Name != ItemNames.SulfurasHand)
                {
                    currentItem.SellIn--;
                }

                if (currentItem.SellIn < 0)
                {
                    if (currentItem.Name != ItemNames.AgedBrie)
                    {
                        if (currentItem.Name != ItemNames.BackstagePasses)
                        {
                            if (currentItem.Quality > 0 && currentItem.Name != ItemNames.SulfurasHand)
                            {
                                currentItem.Quality--;
                            }
                        }
                        else
                        {
                            currentItem.Quality = 0;
                        }
                    }
                    else if (currentItem.Quality < 50)
                    {
                        currentItem.Quality++;
                    }
                }
            }
        }
    }
}
