namespace RefactoringExerciseI.Inventory
{
    public class RareItem : Item
    {
        public override void AcceptDayVisitor(Visitor visitor)
        {
            visitor.VisitRareItem(this);
        }
    }
}
