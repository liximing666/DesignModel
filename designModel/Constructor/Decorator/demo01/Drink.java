package designModel.Constructor.Decorator.demo01;

//抽象饮品
public abstract class Drink {

    public String des;
    private float price;

    //计算费用的方法
    public abstract float cost();



    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }




}
