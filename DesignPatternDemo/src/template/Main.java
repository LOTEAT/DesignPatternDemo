package template;

public class Main {
    public static void main(String[] args){
        ChinesePoker chinesePoker = new ChinesePoker();
        chinesePoker.play();
        System.out.println();
        Holdem holdem = new Holdem();
        holdem.play();
    }
}
