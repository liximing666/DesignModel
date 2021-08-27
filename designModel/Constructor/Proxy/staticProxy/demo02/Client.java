package designModel.Constructor.Proxy.staticProxy.demo02;

public class Client {
    public static void main(String[] args) {

        Proxy proxy = new Proxy(new Service());
        proxy.create();


    }
}
