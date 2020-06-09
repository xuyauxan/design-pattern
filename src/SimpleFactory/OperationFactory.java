package SimpleFactory;

public class OperationFactory {
    public static Operation operation(String operator){
        Operation op=null;
        if("+".equals(operator)){
            op=new OpertationAdd();
        }else if("-".equals(operator)){
            op=new OpertationSub() ;
        }else if("*".equals(operator)){
            op=new OpertationMul() ;
        }else if("/".equals(operator)) {
            op =new OpertationDiv();
        }else{
            System.out.println("无法计算");
        }
        return op;
    }
}

