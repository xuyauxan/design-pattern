package Decorate;

public class Finery extends Person{
    protected Person component;

    public void decorate(Person component)
    {

        this.component=component;
    }
    @Override
    public void show(){
        if(null !=component)
        {
            component.show();
        }
    }
}
