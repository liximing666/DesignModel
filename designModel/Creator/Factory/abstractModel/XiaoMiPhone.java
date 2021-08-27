package designModel.Creator.Factory.abstractModel;

//定义具体的手机
public class XiaoMiPhone implements Phone{
    @Override
    public void start() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void shutDown() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void callUp() {
        System.out.println("小米手机打电话了");
    }

    @Override
    public void sendMseeage() {
        System.out.println("小米手机发信息了");
    }
}
