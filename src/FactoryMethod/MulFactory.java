package FactoryMethod;

public class MulFactory implements IFactory {
    public Operation createOperation() {
        return new OperationMul();
    }
}