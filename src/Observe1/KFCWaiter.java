package Observe1;

public class KFCWaiter {
    private MealBuilder mb;
    //    服务员
    public KFCWaiter(MealBuilder mb){
        this.mb=mb;
    }
    public Meal construct(){
//        准备过程
        mb.BuildFood();
        mb.BuildDrinks();
        return mb.getMeal();
    }
}
