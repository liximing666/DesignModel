package designModel.Creator.Factory.abstractModel;

public class HuaWeiLaptop implements Laptop{
    @Override
    public void use() {
        System.out.println("使用华为电脑");
    }

    @Override
    public void internet() {
        System.out.println("正在用华为电脑上网");
    }

    @Override
    public void study() {
        System.out.println("正在研究华为电脑");
    }
}
