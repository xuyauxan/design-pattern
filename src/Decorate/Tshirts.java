package Decorate;

public class Tshirts extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}
