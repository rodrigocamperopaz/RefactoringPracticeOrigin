using RefactoringExerciseI.Inventory;

namespace RefactoringExerciseI.Inventory
{
    public class ItemNameHandlerFactory : IHandlerFactory
    {
        public IHandlerItem CreateHandler()
        {
            IHandlerItem handlerStandar = new HandlerStandardItem();
            IHandlerItem handlerBackstage = new HandlerBackstagePasses();
            IHandlerItem handlerAged = new HandlerAgedBrie();

            handlerBackstage.SetNext(handlerStandar);
            handlerAged.SetNext(handlerBackstage);

            return handlerAged;
        }
    }
}
