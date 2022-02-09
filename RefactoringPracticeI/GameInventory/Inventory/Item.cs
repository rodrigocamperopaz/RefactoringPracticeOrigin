
using GameInventory.Inventory.Enums;

namespace RefactoringExerciseI.Inventory;

public class Item
{
    #region Properties

    public string? Name { get; set; }
    public int SellIn { get; set; }
    public int Quality { get; set; }

    #endregion

    #region Public Methods 

    public override string ToString() => $"{Name}, {SellIn}, {Quality}";

    public bool IsValid() => this is not null &&  !string.IsNullOrEmpty(this.Name);


    #endregion

}
