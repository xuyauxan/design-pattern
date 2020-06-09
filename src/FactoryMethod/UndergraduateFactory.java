package FactoryMethod;

public class UndergraduateFactory implements IFactory1{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
