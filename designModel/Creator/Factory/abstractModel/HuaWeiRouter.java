package designModel.Creator.Factory.abstractModel;

public class HuaWeiRouter implements Router{
    @Override
    public void open() {
        System.out.println("华为路由器打开了");
    }

    @Override
    public void turnOff() {
        System.out.println("华为路由器关闭了");

    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开了wifi");

    }

    @Override
    public void reStart() {
        System.out.println("华为路由器重启了");
    }
}
