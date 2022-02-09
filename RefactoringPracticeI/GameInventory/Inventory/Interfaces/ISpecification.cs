using GameInventory.Inventory.Enums;


namespace GameInventory.Inventory.Interfaces;

interface ISpecificationQuality<T>
{
    bool IsSatisfied(T item);
}

interface ISpecificationSell<T>
{
    bool IsSatisfied(T item, ESellIn sellin);
}

