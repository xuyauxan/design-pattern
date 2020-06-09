package Observe2;

public class Main {
    public static void main(String[] args){
        Boss b=new Boss();

        // 看股票的人
        StockObserver so1 = new StockObserver("小明", b);

        // 看NBA的人
        NBAObserver n1 = new NBAObserver("小王", b);

        b.attach(so1);
        b.attach(n1);

        // 老板回来
        b.setAction("亲爱的员工们我回来了！");
        b.announce();
    }
}

