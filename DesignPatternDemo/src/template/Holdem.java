package template;

/**
 * 德州扑克
 */
public class Holdem extends PokerGame{
    @Override
    void shuffle(){
        System.out.println("德州扑克洗牌，去除大小王的一副牌");
    }
    @Override
    void send(){
        System.out.println("每人抽两张底牌");
    }
    @Override
    void start(){
        System.out.println("德州扑克游戏开始");
    }
    @Override
    void end(){
        System.out.println("德州扑克游戏结束");
    }
}
