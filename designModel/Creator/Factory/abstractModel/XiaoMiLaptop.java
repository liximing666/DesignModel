package designModel.Creator.Factory.abstractModel;

public class XiaoMiLaptop implements Laptop {
    @Override
    public void use() {
        System.out.println("使用小米电脑");
    }

    @Override
    public void internet() {
        System.out.println("正在用小米电脑上网");
    }

    @Override
    public void study() {
        System.out.println("正在研究小米电脑");
    }
}
