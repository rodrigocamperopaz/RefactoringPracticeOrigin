
namespace RefactoringExerciseI.Inventory
{
    public class ItemDayVisitor : Visitor
    {
        public void VisitSulfuras(Item sulfurasItem)
        {
            return;
        }
        public void VisitAgedBrie(Item agedBrieItem)
        {
            if (agedBrieItem.Quality < 50 )
            {
                agedBrieItem.Quality++;
            }

            agedBrieItem.SellIn--;

            if (agedBrieItem.SellIn < 0 && agedBrieItem.Quality < 50)
            {
                agedBrieItem.Quality++;
            }
        }
        public void VisitBackstagePasses(Item backstagePassesItem)
        {
            if (backstagePassesItem.Quality < 50)
            {
                backstagePassesItem.Quality++;
            }
            if (backstagePassesItem.SellIn < 11 && backstagePassesItem.Quality < 50)
            {
                backstagePassesItem.Quality++;
            }
            if (backstagePassesItem.SellIn < 6 && backstagePassesItem.Quality < 50)
            {
                backstagePassesItem.Quality++;
            }

            backstagePassesItem.SellIn--;

            if (backstagePassesItem.SellIn < 0)
            {
                backstagePassesItem.Quality = 0;
            }
        }
        public void VisitCommonItem(Item commonItem)
        {
            if (commonItem.Quality > 0)
            {
                commonItem.Quality--;
            }

            commonItem.SellIn--;

            if (commonItem.SellIn < 0 && commonItem.Quality > 0)
            {
                commonItem.Quality--;
            }
        }
    }
}
