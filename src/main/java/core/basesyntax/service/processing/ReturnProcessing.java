package core.basesyntax.service.processing;

import core.basesyntax.dao.FruitsDao;

public class ReturnProcessing implements OperationProcessing {
    private FruitsDao fruitsDao;

    public ReturnProcessing(FruitsDao fruitsDao) {
        this.fruitsDao = fruitsDao;
    }

    @Override
    public void doAction(String fruit, int amount) {
        fruitsDao.add(fruit, amount);
    }
}
