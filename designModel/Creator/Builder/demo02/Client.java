package designModel.Creator.Builder.demo02;


//因为指挥者不负责直接构造产品的步骤，具体构建是builder来实现，所以改进为builder直接构造，这样可以自定义构造的步骤，没改变就给默认值，改了就返回修改的对象
//builderModel：具体的builder 实现抽象的builder  一步一步的构造出产品对象
public class Client {
    public static void main(String[] args) {

        Builder builder = new Builder();

        Snack S1 = builder.buildA("冰淇淋");
        System.out.println(S1.toString());

        Snack s2 = new Builder().buildSnack();
        System.out.println(s2.toString());

        Snack s3 = new Builder().buildC("雪碧");
        System.out.println(s3.toString());
    }
}
