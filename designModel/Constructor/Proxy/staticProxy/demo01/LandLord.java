package designModel.Constructor.Proxy.staticProxy.demo01;
//房东
public class LandLord implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
