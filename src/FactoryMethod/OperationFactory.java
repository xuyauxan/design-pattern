package FactoryMethod;

public class OperationFactory {
    public static Operation operation(String operator){
        Operation op=null;
        if("+".equals(operator)){
            op=new OperationAdd();
        }else if("-".equals(operator)){
            op=new OperationSub() ;
        }else if("*".equals(operator)){
            op=new OperationMul() ;
        }else if("/".equals(operator)) {
            op =new OperationDiv();
        }else{
            System.out.println("无法计算");
        }
        return op;
    }
}

