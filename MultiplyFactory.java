package Homework7;

public class MultiplyFactory implements IOperationFactory {

    @Override
    public Operation createOperation() {
        return new Multiply();
    }
}
