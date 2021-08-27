package designModel.Creator.Factory.abstractModel;

public class IMac implements Laptop{
    @Override
    public void use() {
        System.out.println("使用苹果电脑");
    }

    @Override
    public void internet() {
        System.out.println("正在用苹果电脑上网");
    }

    @Override
    public void study() {
        System.out.println("正在研究苹果电脑");
    }
}
