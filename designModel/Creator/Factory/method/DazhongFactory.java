package designModel.Creator.Factory.method;

public class DazhongFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Dazhong();
    }
}
