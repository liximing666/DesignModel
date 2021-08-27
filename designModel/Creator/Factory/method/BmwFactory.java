package designModel.Creator.Factory.method;

public class BmwFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
