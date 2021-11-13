package state;

/**
 * 正常状态
 */
public class NormalState extends State{
    public NormalState(int score){
        super(score);
        mode = "Normal";
    }
    public State E1(){
        return new SuperState(score + 150);
    }
    public State E2(){
        return new MetalState(score + 100);
    }
    public State E3(){
        return new FireState(score - 200);
    }
    public State E4(){
        return this;
    }
}
