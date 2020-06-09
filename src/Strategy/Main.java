package Strategy;

public class Main {
    private static double total =0;

    public static void  main(String[]args)
    {
        consume("正常收费",1,1000);
        consume("满300返100",1,1000);
        consume("打8折",1,1000);
    }

    private static void consume(String type, int num, double price)
    {
        CashSuper csuper = CashFactory.createCash(type);
        double totalPrices = csuper.acceptCash(num * price);
        total +=totalPrices;
        System.out.println("单价:"+price+"数量:"+num+"合计:"+totalPrices);
    }
}
