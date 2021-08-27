package designModel.Constructor.strategy;

public class NoFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
