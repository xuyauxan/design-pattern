package FactoryMethod;

public class Main1 {
    public static void main(String[] args){
        IFactory1 iF=new UndergraduateFactory();
        IFactory1 iF1=new VolunteerFactory();
        LeiFeng lf=iF.createLeiFeng();
        LeiFeng lf1=iF1.createLeiFeng();
        lf.getResult();
        lf1.getResult();
    }
}

