package designModel.Creator.Single;

//懒汉式（线程安全）
public class Single4 {
    public static void main(String[] args) {

        Cat instance = Cat.getInstance();
        System.out.println(instance.toString());

    }
}


class Cat {

    private String name = "kity";

    private static Cat cat = null;

    private Cat() {
    }

    public static synchronized Cat getInstance() { //加上同步机制，来保证线程的安全，但是效率变低了，同步的范围太大
        if (cat == null) {
            cat = new Cat();
        }

        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
