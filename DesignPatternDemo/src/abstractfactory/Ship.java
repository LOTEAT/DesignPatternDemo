package abstractfactory;

/**
 * 轮船类
 */
public class Ship implements Transportation {
    public void move(){
        System.out.println("轮船在水中航行");
    }
}
