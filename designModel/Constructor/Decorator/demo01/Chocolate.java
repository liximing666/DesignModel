package designModel.Constructor.Decorator.demo01;

public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes("chocolate");
        setPrice(3f);
    }
}
