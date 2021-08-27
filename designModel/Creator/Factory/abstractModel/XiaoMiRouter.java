package designModel.Creator.Factory.abstractModel;

public class XiaoMiRouter implements Router{
    @Override
    public void open() {
        System.out.println("小米路由器打开了");
    }

    @Override
    public void turnOff() {
        System.out.println("小米路由器关闭了");

    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开了wifi");

    }

    @Override
    public void reStart() {
        System.out.println("小米路由器重启了");
    }
}
