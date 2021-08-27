package designModel.Constructor.strategy;

public class GoodFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("good fly");
    }
}
