package command;

/**
 * 命令1 上学
 */
public class GoToSchool implements Order{
    private Transportation transportation;
    public GoToSchool(Transportation transportation){
        this.transportation = transportation;
    }
    public void execute(){
        transportation.goToSchool();
    }
}
