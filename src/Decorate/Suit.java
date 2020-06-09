package Decorate;

public class Suit extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("西装");
    }
}
