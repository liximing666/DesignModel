package designModel.Constructor.Decorator.demo01;
//定义调料类，调料也有名字和价格 和 获得价格的方法
public class Decorator extends Drink {

    //组合 drink （点的咖啡）
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    //计算 咖啡 + 调料的价格
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + obj.getDes();
    }
}
