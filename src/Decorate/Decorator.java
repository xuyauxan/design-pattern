package Decorate;

public class Decorator implements Component{
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {

        this.component = component;
    }

    @Override
    public void operation() {
        if(null!=component){
            component.operation();
        }
    }
}

