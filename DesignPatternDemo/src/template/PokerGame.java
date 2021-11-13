package template;

/**
 * 扑克游戏抽象基类
 */
public abstract class PokerGame {
    // 洗牌
    abstract void shuffle();
    // 发牌
    abstract void send();
    // 游戏开始
    abstract void start();
    // 游戏结束
    abstract void end();
    // 模板
    public final void play(){
        shuffle();
        send();
        start();
        end();
    }
}
