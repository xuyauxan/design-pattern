package FactoryMethod;

public class OperationDiv extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        if (getNumberB() != 0) {
            result = getNumberA() / getNumberB();
        } else {
            return -1;
        }
        return result;
    }
}

