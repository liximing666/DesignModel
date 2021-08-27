package designModel.Constructor.strategy;

public class WideDuck extends Duck{
    public WideDuck(String s, FlyStrategy flyStrategy) {
        this.type = s;
        this.flyStrategy = flyStrategy;
        this.drinkStrategy = new IsDrink();
    }

    public void fly() {
        flyStrategy.fly();
    }

    public void drink() {
        drinkStrategy.drink();
    }
}
