namespace RefactoringExerciseI.Inventory
{
    public class BackstagePassesItem : Item
    {
        public override void AcceptDayVisitor(Visitor visitor)
        {
            visitor.VisitBackstagePasses(this);
        }
    }
}
