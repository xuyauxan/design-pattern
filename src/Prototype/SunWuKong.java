package Prototype;

public class SunWuKong implements Cloneable{
    private String name;

    public SunWuKong(String name){
        this.name=name;
    }

    public void display(){
        System.out.println(name);
    }
    @Override
    public SunWuKong clone(){
        try {
            return (SunWuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

