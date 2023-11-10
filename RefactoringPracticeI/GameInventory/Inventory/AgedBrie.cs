

namespace RefactoringExerciseI.Inventory
{
    public class AgedBrie : Item
    {
        public override void AcceptDayVisitor (Visitor visitor)
        {
            visitor.VisitAgedBrie(this);
        }
    }
}
