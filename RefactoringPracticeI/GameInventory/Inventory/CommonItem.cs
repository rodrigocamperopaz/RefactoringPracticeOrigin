
namespace RefactoringExerciseI.Inventory
{
    public class CommonItem : Item
    {
        public override void AcceptDayVisitor(Visitor visitor)
        {
            visitor.VisitCommonItem(this);
        }
    }
}
