package designModel.Constructor.Proxy.staticProxy.demo02;

public class Proxy implements UserService{

    private Service service;

    public Proxy(Service service) {
        this.service = service;
    }


    public void log(String s) {
        System.out.println("is " + s);
    }

    @Override
    public void create() {
        log("add");
        service.create();
    }

    @Override
    public void delete() {
        log("delete");
        service.delete();
    }

    @Override
    public void update() {
        log("update");
        service.update();
    }

    @Override
    public void query() {
        log("query");
        service.query();
    }
}
