
namespace RefactoringExerciseI.Inventory
{
    public interface Visitor
    {
        public void VisitEpicItem(EpicItem epicItem);
        public void VisitLegendaryItem(LegendaryItem legendaryItem);
        public void VisitRareItem(RareItem rareItem);
        public void VisitCommonItem(CommonItem commonItem);
    }
}
