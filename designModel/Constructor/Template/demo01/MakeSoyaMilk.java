package designModel.Constructor.Template.demo01;

public abstract class MakeSoyaMilk {

//    public boolean isAdd() {
//        return true;
//    }
    public boolean isAdd = true;

    public void select() {
        System.out.println("选择黄豆");
    }


    public abstract void add();

    public  void immerse() {
        System.out.println("浸泡");
    }

    public  void grind() {
        System.out.println("研磨");
    }

    public void make() {

        select();

        //用标志位来决定是否使用某些步骤
        if (isAdd) {
            add();
        }

        immerse();
        grind();

    }




}
