package designModel.Creator.Factory.abstractModel;

public class AppleFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new Iphone();
    }

    @Override
    public Router getRouter() {
        return new IRouter();
    }

    @Override
    public Laptop getLaptop() {
        return new IMac();
    }
}
