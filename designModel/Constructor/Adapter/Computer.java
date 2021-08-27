package designModel.Constructor.Adapter;

public class Computer {

    Adepter adepter;

    public Computer(Adepter adepter) {
        this.adepter = adepter;
    }

    public void net() {
        adepter.handleRequest();
        System.out.println("上网了");
    }

}
