package SimpleFactory;

public class OpertationSub extends Operation{
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}