

namespace RefactoringExerciseI.Inventory
{
    public abstract class Item
    {
        public string? Name { get; set; }
        public int SellIn { get; set; }
        public int Quality { get; set; }

        public abstract void AcceptDayVisitor(Visitor visitor);

        public override string ToString()
        {
            return Name + ", " + SellIn + ", " + Quality;
        }
    }
}