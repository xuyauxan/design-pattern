package Appearance;

public class NationalDebt2 implements Fund{

    @Override
    public void buyFund() {
        System.out.println("国债2买入");
    }

    @Override
    public void sellFund() {
        System.out.println("国债2卖出");
    }
}

