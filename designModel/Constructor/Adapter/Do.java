package designModel.Constructor.Adapter;

//适配器模式：找一个中间的对象来沟通另外两个对象
//重点学习类与类发生关系的一种方式 —— 组合

public class Do {
    public static void main(String[] args) {
        //造网线
        NetLine netLine = new NetLine();
        //网线插进适配器
        Adapt adapt = new Adapt(netLine);
        //适配器插进电脑
        Computer computer = new Computer(adapt);

        computer.net();

    }
}
