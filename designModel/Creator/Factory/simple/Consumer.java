package designModel.Creator.Factory.simple;

//实用性强，优先选择，一个工厂造多个对象

public class Consumer {
    public static void main(String[] args) {
        Car wulin = CarFactory.getCar("wulin");
        Car benz = CarFactory.getCar("benz");
        Car dazhong = CarFactory.getCar("dazhong");

        wulin.name();
        benz.name();
        dazhong.name();
    }
}
