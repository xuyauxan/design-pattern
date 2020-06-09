package FactoryMethod;

public class Main {
    public static void main(String[] args){
        IFactory iF= new AddFactory();
        IFactory iF1= new DivFactory();
        Operation oP = iF.createOperation();
        Operation oP1 = iF1.createOperation();
        oP.setNumberA(1);
        oP.setNumberB(2);
        oP1.setNumberA(1);
        oP1.setNumberB(2);
        try {
            double result = oP.getResult();
            System.out.println("结果是:" + result);
            double result1 = oP1.getResult();
            System.out.println("结果是:" + result1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

