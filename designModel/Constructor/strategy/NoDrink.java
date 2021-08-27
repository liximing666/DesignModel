package designModel.Constructor.strategy;

public class NoDrink implements DrinkStrategy{
    @Override
    public void drink() {
        System.out.println("not drink");
    }
}
