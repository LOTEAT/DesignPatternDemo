package state;

/**
 * ιε±ηΆζ
 */
public class MetalState extends State{
    public MetalState(int score){
        super(score);
        mode = "Metal";
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
