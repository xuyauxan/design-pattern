package FactoryMethod;

public class Undergraduate implements LeiFeng{

    public void sweep() {
        System.out.println("扫地");
    }
    public void wash() {
        System.out.println("洗衣");
    }
    @Override
    public void getResult(){
        Undergraduate u=new Undergraduate();
        u.sweep();
        u.wash();
    }
}

