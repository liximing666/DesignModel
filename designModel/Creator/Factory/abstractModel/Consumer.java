package designModel.Creator.Factory.abstractModel;

//抽象工厂模式   定义一个抽象工厂， 自己实现具体的工厂造具体的实例，在工厂制造的实例稳定的情况下好用，因若不然，增加产品，各种实现类也要改动
public class Consumer {
    public static void main(String[] args) {

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.getPhone().start();
        huaWeiFactory.getRouter().open();
        huaWeiFactory.getLaptop().study();

        System.out.println("-----------------------------------------------");

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.getPhone().start();
        xiaoMiFactory.getRouter().open();
        xiaoMiFactory.getLaptop().study();
        System.out.println("-----------------------------------------------");

        AppleFactory appleFactory = new AppleFactory();
        appleFactory.getPhone().start();
        appleFactory.getRouter().open();
        appleFactory.getLaptop().study();
        System.out.println("-----------------------------------------------");




    }
}
