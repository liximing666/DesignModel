package designModel.Creator.Single;

//懒汉式 （线程不安全）
public class Single3 {
    public static void main(String[] args) {

        Dog instance = Dog.getInstance();
        System.out.println(instance.toString());

    }
}


class Dog {
    private String name = "dog";
    private static Dog dog = null;

    private Dog() {
    }

    //需要着个对象时候才创建，并没有提前造好，什么时候用什么时候造
    public static Dog getInstance() {

        if (dog == null) { //在这里线程不安全，t1 进去了 切换到 t2 也有可能进去
            dog = new Dog();
        }

        return dog;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
