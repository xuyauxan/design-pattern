package FactoryMethod;

public class Volunteer implements LeiFeng{

    public void buildRoad(){
        System.out.println("修路");
    }
    public void buyrice(){
        System.out.println("买米");
    }
    @Override
    public void getResult(){
        Volunteer v=new Volunteer();
        v.buildRoad();
        v.buyrice();
    }
}

