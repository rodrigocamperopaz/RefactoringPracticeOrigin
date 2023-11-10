namespace RefactoringExerciseI.Inventory
{
    public class SulfurasItem : Item
    {
        public override void AcceptDayVisitor(Visitor visitor)
        {
            visitor.VisitSulfuras(this);
        }
    }
}
