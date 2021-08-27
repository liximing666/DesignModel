package designModel.Constructor.strategy;

public class IsDrink implements DrinkStrategy{
    @Override
    public void drink() {
        System.out.println("is drink");
    }
}
