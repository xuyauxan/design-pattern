package Decorate;

public class Main {
    public static void main(String[]args){
       Person person =new Person("小菜");

        System.out.println("第一种装扮: ");

        Sneakers pqx =new Sneakers();
        Bigtrouser kk=new Bigtrouser();
        Tshirts dtx=new Tshirts();
        pqx.decorate(person);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮: ");

        LeatherShoes px=new LeatherShoes();
        Tie ld=new Tie();
        Suit xz=new Suit();

        px.decorate(person);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();
        System.out.println("第三种装扮: ");

        Sweater sw=new Sweater();
        Overalls ov=new Overalls();
        Converse ca=new Converse();

        sw.decorate(person);
        ov.decorate(sw);
        ca.decorate(ov);
        ca.show();
    }
}
