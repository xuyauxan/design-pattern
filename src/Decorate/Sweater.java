package Decorate;

public class Sweater extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("黑色的外套");
    }
}
