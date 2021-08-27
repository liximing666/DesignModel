package designModel.Constructor.Template.demo01;

public class Client {
    public static void main(String[] args) {
        RedSoyaMilk redSoyaMilk = new RedSoyaMilk();
        redSoyaMilk.make();

        System.out.println("-----------------------------------------");

        BlackSoyaMilk blackSoyaMilk = new BlackSoyaMilk();
        blackSoyaMilk.make();

        System.out.println("-----------------------------------------");

        Pure pure = new Pure();
        pure.make();

    }
}
