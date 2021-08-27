package designModel.Constructor.Composite.demo;

public class Client {
    public static void main(String[] args) {

        User aaa = new User("aaa");
        aaa.addMoney(666);

        User bbb = new User("bbb");
        bbb.addMoney(999);

        User ccc = new User("ccc");
        ccc.addMoney(10000);

        Bank cbc = new Bank("CBC");
        cbc.add(aaa);
        cbc.add(bbb);
        cbc.add(ccc);

        cbc.print();

    }
}
