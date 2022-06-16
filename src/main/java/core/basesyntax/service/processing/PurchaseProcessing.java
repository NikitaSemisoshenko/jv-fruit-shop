package core.basesyntax.service.processing;

import core.basesyntax.dao.FruitsDao;

public class PurchaseProcessing implements OperationProcessing {
    private FruitsDao fruitsDao;

    public PurchaseProcessing(FruitsDao fruitsDao) {
        this.fruitsDao = fruitsDao;
    }

    @Override
    public void doAction(String fruit, int amount) {
        int oldQuantity = fruitsDao.get(fruit);
        int newQuantity = oldQuantity - amount;
        fruitsDao.remove(fruit);
        fruitsDao.add(fruit, newQuantity);
    }
}
