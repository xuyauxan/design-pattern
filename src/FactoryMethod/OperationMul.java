package FactoryMethod;

public class OperationMul extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}

