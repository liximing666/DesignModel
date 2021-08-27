package designModel.Creator.Factory.abstractModel;

//定义一个抽象工厂
public interface Factory {

    Phone getPhone();

    Router getRouter();

    Laptop getLaptop();
}
