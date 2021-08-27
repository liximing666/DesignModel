package designModel.Creator.Factory.method;

public class WulinFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Wulin();
    }
}
