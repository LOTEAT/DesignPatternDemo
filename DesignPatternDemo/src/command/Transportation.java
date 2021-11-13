package command;

/**
 * 交通工具
 */
public class Transportation {
    private String name = "汽车";

    public void goHome(){
        System.out.println("乘" + name + "回家");
    }

    public void goToSchool(){
        System.out.println("乘" + name + "去上学");
    }

}
