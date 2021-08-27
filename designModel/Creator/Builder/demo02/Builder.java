package designModel.Creator.Builder.demo02;

public class Builder extends AbstractBuilder{
    Snack snack = null;
    
    //构造者内部构造一个产品
    public Builder() {
        this.snack = new Snack();
    }


    @Override
    public Snack buildA(String s) {
        this.snack.setPartA(s);
        return snack;
    }

    @Override
    public Snack buildB(String s) {
        this.snack.setPartB(s);
        return snack;
    }

    @Override
    public Snack buildC(String s) {
        this.snack.setPartC(s);
        return snack;
    }

    @Override
    public Snack buildD(String s) {
        this.snack.setPartD(s);
        return snack;
    }

    @Override
    public Snack buildSnack() {
        return this.snack;
    }
}
