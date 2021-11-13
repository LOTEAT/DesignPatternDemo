package command;

/**
 * 命令2 回家
 */
public class GoHome implements Order{
    private Transportation transportation;
    public GoHome(Transportation transportation){
        this.transportation = transportation;
    }
    public void execute(){
        transportation.goHome();
    }
}
