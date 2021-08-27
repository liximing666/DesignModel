package designModel.Constructor.Composite.demo;

public class Account {

    private int money = 0;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void add(int count) {
        money += count;
    }


    public void remove(int count) {
        if (this.money >= count) {
            this.money -= count;
        }else {
            System.out.println("余额不足");
        }
    }


    public void print() {
        System.out.println(getMoney());
    }
}
