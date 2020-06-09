package BuilderP;

import java.awt.*;

public class PersonFatBuilder extends PersonBuilder{

    public PersonFatBuilder(Graphics g) {
        super(g);
    }

    @Override
    public void builderhead() {
        g.fillOval(50,50,30,30);
    }

    @Override
    public void builderbody() {
        g.fillRect(50, 80, 30, 50);
    }

    @Override
    public void builderlhand() {
        g.drawLine(60,80,40,130);
    }

    @Override
    public void builderrhand() {
        g.drawLine(70,80,90,130);
    }

    @Override
    public void builderlleg() {
        g.drawLine(60, 130, 45, 180);
    }

    @Override
    public void builderrleg() {
        g.drawLine(70, 130, 85, 180);
    }
}
