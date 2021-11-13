package state;

/**
 * 超级马里奥
 */
public class SuperMarioBros {
    private State mode = new NormalState(0);
    public void E1(){
        mode = mode.E1();
    }
    public void E2(){
        mode = mode.E2();
    }
    public void E3(){
        mode = mode.E3();
    }
    public void E4(){
        mode = mode.E4();
    }
    public int getScore(){
        return mode.getScore();
    }
    public String getMode(){
        return mode.getMode();
    }

}
