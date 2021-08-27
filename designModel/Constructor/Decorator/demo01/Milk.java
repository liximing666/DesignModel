package designModel.Constructor.Decorator.demo01;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("milk");
        setPrice(2f);
    }
}
