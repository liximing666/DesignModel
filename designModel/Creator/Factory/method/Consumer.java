package designModel.Creator.Factory.method;

//把工厂给细分，不同的工厂造不同的对象，扩展性变强，但是代码复杂度上升
public class Consumer {
    public static void main(String[] args) {

         new WulinFactory().getCar().name();
         new DazhongFactory().getCar().name();
         new BmwFactory().getCar().name();

    }
}
