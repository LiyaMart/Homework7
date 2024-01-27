package Homework7;

public class DivisionFactory implements IOperationFactory {

    @Override
    public Operation createOperation() {
        return new Division();
    }
}
