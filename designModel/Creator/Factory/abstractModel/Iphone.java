package designModel.Creator.Factory.abstractModel;

public class Iphone implements Phone{
    @Override
    public void start() {
        System.out.println("苹果手机开机了");
    }

    @Override
    public void shutDown() {
        System.out.println("苹果手机关机了");
    }

    @Override
    public void callUp() {
        System.out.println("苹果手机打电话了");
    }

    @Override
    public void sendMseeage() {
        System.out.println("苹果手机发信息了");
    }
}
