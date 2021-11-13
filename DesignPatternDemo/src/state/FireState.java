package state;

/**
 * 火焰状态
 */
public class FireState extends State{
    public FireState(int score){
        super(score);
        this.mode = "Fire";
    }
    public State E1(){
        return this;
    }
    public State E2(){
        return this;
    }
    public State E3(){
        return this;
    }
    public State E4(){
        return new NormalState(score - 233);
    }
}
