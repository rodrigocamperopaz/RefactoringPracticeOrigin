
namespace RefactoringExerciseI.Inventory
{
    public class ItemDayVisitor : Visitor
    {
        public void VisitLegendaryItem(LegendaryItem legendaryItem)
        {
            return;
        }
        public void VisitEpicItem(EpicItem epicItem)
        {
            if (epicItem.Quality < 50 )
            {
                epicItem.Quality++;
            }

            epicItem.SellIn--;

            if (epicItem.SellIn < 0 && epicItem.Quality < 50)
            {
                epicItem.Quality++;
            }
        }
        public void VisitRareItem(RareItem rareItem)
        {
            if (rareItem.Quality < 0)
            {
                rareItem.Quality++;
            }
            if (rareItem.SellIn < 11 && rareItem.Quality < 50)
            {
                rareItem.Quality++;
            }
            if (rareItem.SellIn < 6 && rareItem.Quality < 50)
            {
                rareItem.Quality++;
            }

            rareItem.SellIn--;

            if (rareItem.SellIn < 0)
            {
                rareItem.Quality = 0;
            }
        }
        public void VisitCommonItem(CommonItem commonItem)
        {
            if (commonItem.Quality > 0)
            {

            }

            commonItem.SellIn--;

            if (commonItem.SellIn < 0 && commonItem.Quality > 0)
            {
                commonItem.Quality--;
            }
        }
    }
}
