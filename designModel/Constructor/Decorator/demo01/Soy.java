package designModel.Constructor.Decorator.demo01;

public class Soy extends Decorator{


    public Soy(Drink obj) {
        super(obj);
        setDes("soy");
        setPrice(1.5f);
    }
}
