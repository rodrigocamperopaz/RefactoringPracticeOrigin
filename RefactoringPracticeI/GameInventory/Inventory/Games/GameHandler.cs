
using GameInventory.Inventory.Interfaces;
using RefactoringExerciseI.Inventory;

namespace GameInventory.Games;
abstract class GameHandler
{
    protected ISpecificationQuality<Item> _specQuality;
    protected ISpecificationSell<Item> _specSell;

    protected GameHandler() 
    {
    }

    protected GameHandler(ISpecificationQuality<Item> specQuality, ISpecificationSell<Item> specSell)
    {
        _specQuality = specQuality;
        _specSell = specSell;
    }

    public abstract void UpdateQualityAndSell(Item item);
}

