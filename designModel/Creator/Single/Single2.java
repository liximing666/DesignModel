package designModel.Creator.Single;


//饿汉模式 （静态代码块）
public class Single2 {
    public static void main(String[] args) {
        Person2 instance = Person2.getInstance();
        System.out.println(instance.toString());

    }
}

class Person2 {

    private String name = "bbb";
    private int age = 26;

    private Person2() {
    }

    private static Person2 person2 = null;

    //类一加载就会自动执行静态代码块创建对象
    static {
        person2 = new Person2();
    }
    //提供对外接口
    public static Person2 getInstance(){
        return person2;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
