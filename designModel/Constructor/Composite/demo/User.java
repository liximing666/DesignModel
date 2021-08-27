package designModel.Constructor.Composite.demo;

public class User extends Thing {
     private Account account;

    public User(String name) {
        super(name);
        this.account = new Account();
    }

    public void addMoney(int count) {
        this.account.add(count);
    }

    public void removeMoney(int count) {
        this.account.remove(count);
    }

    public void showMoney(int count) {
       this.account.print();
    }
    public int getMoney() {
        return this.account.getMoney();
    }



}
