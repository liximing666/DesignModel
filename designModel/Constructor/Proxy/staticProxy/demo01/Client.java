package designModel.Constructor.Proxy.staticProxy.demo01;

/*
静态代理模式作用：

为其他对象提供一种代理，以控制对这个对象的访问，在某些情况下，一个客户不想或者不能

直接引用另外一个对象，而代理对象可以在客户与目标对象直接起到中介的作用。

静态代理模式一般涉及的角色有：
接口：代理对象和目标对象共同的行为接口。

代理角色：代理对象内部含有对真实对象的引用，从而可以操作真实角色。需要实现行为接口。

真实角色：代理类需要代理的角色，实现行为接口。


缺点：一对一 一个代理只代理一个（用动态代理解决）

 */

public class Client {
    public static void main(String[] args) {

        LandLord landLord = new LandLord();

        Angent angent = new Angent(landLord);

        angent.showHouse();

        angent.reciveMoney();

        angent.rent();

    }
}
