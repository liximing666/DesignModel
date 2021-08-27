package designModel.Creator.Factory.abstractModel;

public class XiaoMiFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Router getRouter() {
        return new XiaoMiRouter();
    }

    @Override
    public Laptop getLaptop() {
        return new XiaoMiLaptop();
    }
}
