package designModel.Constructor.Template;

//模板模式（一步一步走流程） 在抽象类中定义实现的步骤，实现的流程骨架，继承过来重写各个步骤
//加入钩子方法可以屏蔽掉某些步骤
//类似于建造者模式（一步一步造对象）

public class Client {
    public static void main(String[] args) {

        Opration opration = new Opration();

        opration.template("1", "2", "3", "4");

    }
}
