package Prototype;

public class Main1 {
    public static void main(String[] args){
        SunWuKong sunWuKong=new SunWuKong("孙悟空");
        SunWuKong sunWuKong1=sunWuKong.clone();
        SunWuKong sunWuKong2=sunWuKong.clone();
        sunWuKong.display();
        sunWuKong1.display();
        sunWuKong2.display();
    }
}
