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
                if (_items[index].Name != ItemNames.AgedBrie && _items[index].Name != ItemNames.BackstagePasses)
                {
                    if (_items[index].Quality > 0 && _items[index].Name != ItemNames.SulfurasHand)
                    {
                        _items[index].Quality--;
                    }
                }
                else if (_items[index].Quality < 50)
                {
                    _items[index].Quality++;

                    if (_items[index].Name == ItemNames.BackstagePasses)
                    {
                        if (_items[index].SellIn < 11 && _items[index].Quality < 50)
                        {
                            _items[index].Quality++;
                        }

                        if (_items[index].SellIn < 6 && _items[index].Quality < 50)
                        {
                            _items[index].Quality++;
                        }
                    }
                }

                if (_items[index].Name != ItemNames.SulfurasHand)
                {
                    _items[index].SellIn--;
                }

                if (_items[index].SellIn < 0)
                {
                    if (_items[index].Name != ItemNames.AgedBrie)
                    {
                        if (_items[index].Name != ItemNames.BackstagePasses)
                        {
                            if (_items[index].Quality > 0 && _items[index].Name != ItemNames.SulfurasHand)
                            {
                                _items[index].Quality--;
                            }
                        }
                        else
                        {
                            _items[index].Quality = 0;
                        }
                    }
                    else if (_items[index].Quality < 50)
                    {
                        _items[index].Quality++;
                    }
                }
            }
        }
    }
}
