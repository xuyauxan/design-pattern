package SimpleFactory;

public class OpertationMul extends Operation{
    public double getResult(){
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}

