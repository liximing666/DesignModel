package designModel.Creator.Factory.abstractModel;

public class HuaWeiFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Router getRouter() {
        return new HuaWeiRouter();
    }

    @Override
    public Laptop getLaptop() {
        return new HuaWeiLaptop();
    }
}
