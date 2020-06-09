package Observe2;

public class NBAObserver extends Observer{
    public NBAObserver(String name,Subject sub){
        super(name,sub);
    }
    @Override
    public void update() {
        System.out.println(sub.getAction()+" "+name+"关闭电视，努力工作");
    }
}

