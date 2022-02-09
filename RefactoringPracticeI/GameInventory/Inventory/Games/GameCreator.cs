
using GameInventory.Inventory;
using GameInventory.Inventory.Constans;
using RefactoringExerciseI.Inventory;

namespace GameInventory.Games;
internal class GameCreator
{
    private readonly GameHandler _handler;

    public GameCreator(string nameGame) => _handler = nameGame switch
    {
        GameName.Sulfuras => new GameSulfuras(),
        GameName.AgedBrie => new GameAgedBrie(new QualityLessThanFifty(), new SellLessThan()),
        GameName.BackstagePasses => new GameBackstagePasses(new QualityLessThanFifty(), new SellLessThan()),
        _ => new GameOthers(new QualityGreaterThanZero(), new SellLessThan()),
    };

    public void UpdateQualityAndSell(Item item)
    {
        _handler.UpdateQualityAndSell(item);
    }
}

