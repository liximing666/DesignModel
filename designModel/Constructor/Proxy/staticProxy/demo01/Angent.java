package designModel.Constructor.Proxy.staticProxy.demo01;

public class Angent implements Rent {

    //中介需要绑定一个房东（组合）
    private LandLord landLord;

    public Angent(LandLord landLord) {
        this.landLord = landLord;
    }

    @Override
    public void rent() {
        this.landLord.rent();

    }

    //中介可以做，房东不能做的方法(代理的附加操作)

    //看房的方法，中介可以看房，房东不需要看房
    public void showHouse() {
        System.out.println("中介带人看房");
    }

    public void reciveMoney() {
        System.out.println("收中介费");
    }
}
