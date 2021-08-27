package designModel.Creator.Single;

// 饿汉式 (静态常量)
public class Single1 {
    public static void main(String[] args) {

        Person instance = Person.getInstance();
        System.out.println(instance.toString());

    }
}


class Person {

    private String name = "aaa";
    private int age = 16;


    private Person() {
    }

    //内部造好对象
    private static final Person person = new Person();
    //暴露方法去拿着个唯一对象
    public static Person getInstance() {
        return  person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
