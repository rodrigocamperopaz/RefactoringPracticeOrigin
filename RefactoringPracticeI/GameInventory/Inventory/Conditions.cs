using GameInventory.Inventory.Enums;
using GameInventory.Inventory.Interfaces;
using RefactoringExerciseI.Inventory;

namespace GameInventory.Inventory;

internal class QualityLessThanFifty : ISpecificationQuality<Item>
{
    public bool IsSatisfied(Item item) => item.Quality < (int)EQuality.Fifty;
}

internal class QualityGreaterThanZero : ISpecificationQuality<Item>
{
    public bool IsSatisfied(Item item) => item.Quality > (int)EQuality.Zero;
}

internal class SellLessThan : ISpecificationSell<Item>
{
    public bool IsSatisfied(Item item, ESellIn sellin) => item.SellIn < (int)sellin;

}


