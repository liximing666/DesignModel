package designModel.Constructor.strategy;

public class HouseDuck extends Duck {

    public HouseDuck(String s, FlyStrategy flyStrategy) {
        this.type = s;
        this.flyStrategy = flyStrategy;
        this.drinkStrategy = new NoDrink();

    }

    public void fly() {
        flyStrategy.fly();
    }

    public void drink() {
        drinkStrategy.drink();
    }

}
