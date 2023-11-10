namespace RefactoringExerciseI.Inventory
{
    public class LegendaryItem : Item
    {
        public override void AcceptDayVisitor(Visitor visitor)
        {
            visitor.VisitLegendaryItem(this);
        }
    }
}
