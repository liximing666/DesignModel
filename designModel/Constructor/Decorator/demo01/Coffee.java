package designModel.Constructor.Decorator.demo01;

public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
