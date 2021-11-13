package state;

/**
 * 建立一个状态抽象类
 */
public abstract class State {
    protected String mode;
    protected int score;
    public State(int score){
        this.score = score;
    }
    public abstract State E1();
    public abstract State E2();
    public abstract State E3();
    public abstract State E4();
    public String getMode(){return mode;}
    public int getScore(){return score;}
}
