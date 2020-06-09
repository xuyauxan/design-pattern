package Decorate;

public class LeatherShoes extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("皮鞋");
    }
}
