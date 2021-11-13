package template;

/**
 * 斗地主
 */
public class ChinesePoker extends PokerGame{
    @Override
    void shuffle(){
        System.out.println("斗地主洗牌，一副完整的牌");
    }
    @Override
    void send(){
        System.out.println("每人抽取17张牌，留三张牌");
    }
    @Override
    void start(){
        System.out.println("地主叫牌，农民斗地主");
    }
    @Override
    void end(){
        System.out.println("斗地主游戏结束");
    }

}
