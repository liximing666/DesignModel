package designModel.Constructor.strategy;

//继承父类过来要重写的方法太多了怎么办 -- 策略模式
//把类和方法解耦，类要什么方法拿什么，把方法们封装在方法簇里（interface）有点类似写好多个工具类，要什么拿什么
//多用组合和聚合，少用继承

public class Clinent {
    public static void main(String[] args) {

        HouseDuck bj = new HouseDuck("bj", new NoFly());
        bj.fly();
        bj.drink();

        WideDuck wide = new WideDuck("wide",new GoodFly());
        wide.fly();
        wide.drink();


    }
}
