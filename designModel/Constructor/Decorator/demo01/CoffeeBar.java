package designModel.Constructor.Decorator.demo01;

public class CoffeeBar {
    public static void main(String[] args) {

        //先点一杯咖啡
        Drink order = new LongBlack("longBlack");
        float cost = order.cost();


        //再点一份牛奶
        order = new Milk(order);
        System.out.println(order.cost());

        //再点一个巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());

    }
}
