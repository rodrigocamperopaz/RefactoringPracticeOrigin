

namespace RefactoringExerciseI.Inventory
{
    public class EpicItem : Item
    {
        public override void AcceptDayVisitor (Visitor visitor)
        {
            visitor.VisitEpicItem (this);
        }
    }
}
