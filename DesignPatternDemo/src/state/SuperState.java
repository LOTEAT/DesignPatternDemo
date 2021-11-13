package state;

/**
 * 超级状态
 */
public class SuperState extends State{
    public SuperState(int score){
        super(score);
        mode = "Super";
    }
    public State E1(){
        return this;
    }
    public State E2(){
        return new MetalState(score + 100);
    }
    public State E3(){
        return new FireState(score + 200);
    }
    public State E4(){
        return new NormalState(score - 100);
    }
}
