
namespace RefactoringExerciseI.Inventory
{
    public interface Visitor
    {
        public void VisitAgedBrie(Item agedBrieItem);
        public void VisitSulfuras(Item sulfurasItem);
        public void VisitBackstagePasses(Item backstagePassesItem);
        public void VisitCommonItem(Item commonItem);
    }
}
