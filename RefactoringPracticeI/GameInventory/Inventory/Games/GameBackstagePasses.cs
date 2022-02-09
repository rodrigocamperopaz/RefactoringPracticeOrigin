
using GameInventory.Inventory.Enums;
using GameInventory.Inventory.Interfaces;
using RefactoringExerciseI.Inventory;

namespace GameInventory.Games;

internal class GameBackstagePasses : GameHandler
{
    public GameBackstagePasses(ISpecificationQuality<Item> specQuality, 
                               ISpecificationSell<Item> specSell) : base(specQuality,specSell)
    {
    }

    public override void UpdateQualityAndSell(Item item)
    {
        if (_specQuality.IsSatisfied(item))
            item.Quality++;

        if (_specSell.IsSatisfied(item,ESellIn.Eleven) && _specQuality.IsSatisfied(item))
            item.Quality++;

        if (_specSell.IsSatisfied(item, ESellIn.Six) && _specQuality.IsSatisfied(item))
            item.Quality++;

        item.SellIn--;

        if (_specSell.IsSatisfied(item, ESellIn.Zero))
            item.Quality -= item.Quality;
    }
}

