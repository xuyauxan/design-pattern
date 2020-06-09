package Decorate;

public class ConcreateComponent implements Component{
    private String name;
    public ConcreateComponent(String name){
        this.name=name;
    }
    @Override
    public void operation() {
        System.out.println("装饰的"+name);
    }
}
