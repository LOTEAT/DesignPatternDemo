package state;

public class Main {
    public static void main(String[] args){
        System.out.println("begin");
        SuperMarioBros superMarioBros = new SuperMarioBros();
        superMarioBros.E1();
        System.out.println("current state:" + superMarioBros.getMode());
        System.out.println("current score:" + superMarioBros.getScore());
        superMarioBros.E3();
        System.out.println("current state:" + superMarioBros.getMode());
        System.out.println("current score:" + superMarioBros.getScore());
        superMarioBros.E4();
        System.out.println("current state:" + superMarioBros.getMode());
        System.out.println("current score:" + superMarioBros.getScore());
        superMarioBros.E2();
        System.out.println("current state:" + superMarioBros.getMode());
        System.out.println("current score:" + superMarioBros.getScore());
        superMarioBros.E3();
        System.out.println("current state:" + superMarioBros.getMode());
        System.out.println("current score:" + superMarioBros.getScore());
    }
}
