
using GameInventory.Inventory.Enums;
using GameInventory.Inventory.Interfaces;
using RefactoringExerciseI.Inventory;

namespace GameInventory.Games;

internal class GameOthers : GameHandler
{
    public GameOthers(ISpecificationQuality<Item> specQuality,
                      ISpecificationSell<Item> specSell) : base(specQuality,specSell)
    {
    }

    public override void UpdateQualityAndSell(Item item)
    {
        if ( _specQuality.IsSatisfied(item))
            item.Quality--;

        item.SellIn--;

        if (_specSell.IsSatisfied(item, ESellIn.Zero) && _specQuality.IsSatisfied(item))
            item.Quality--;
    }
}

