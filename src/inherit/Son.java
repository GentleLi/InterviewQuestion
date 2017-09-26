package inherit;

/**
 * Created by Jiantao on 2017/9/22.
 */
public class Son extends Father{

    public static void eat(){
        System.out.println("son eat");
    }

    @Override
    public void sing() {
        super.sing();//这里可以比调用 super.sing()
        System.out.println("son sing");
    }


}
