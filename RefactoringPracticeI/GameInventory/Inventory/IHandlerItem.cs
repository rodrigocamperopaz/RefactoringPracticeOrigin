namespace RefactoringExerciseI.Inventory
{
    public interface IHandlerItem
    {
        /*
        * Updates the quality of an item. 
        * @param item The item whose quality will be updated.
        */
        public void UpdateQuality(Item item);

        /*
         * Sets the next handler in the chain of responsibility.
         * @param next The next handler in the chain of responsibility.
         */
        public void SetNext(IHandlerItem next);
    }
}
