package designModel.Creator.Factory.abstractModel;

public class IRouter implements Router{
    @Override
    public void open() {
        System.out.println("苹果路由器打开了");
    }

    @Override
    public void turnOff() {
        System.out.println("苹果路由器关闭了");

    }

    @Override
    public void openWifi() {
        System.out.println("苹果路由器打开了wifi");

    }

    @Override
    public void reStart() {
        System.out.println("苹果路由器重启了");
    }
}
