package Homework7;

public class SummaryFactory implements IOperationFactory {

    @Override
    public Operation createOperation() {
        return new Summary();
    }
}
