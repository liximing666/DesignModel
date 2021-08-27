package designModel.Creator.Builder.demo01;

//builder 负责一步一步构造对象 ，指挥者指挥builder构建
//构造者模式，包工头 指挥工人 一步一步造产品
public class Client {
    public static void main(String[] args) {

        CommenBuilder commenBuilder = new CommenBuilder();

        HouseDerictor houseDerictor = new HouseDerictor(commenBuilder);

        House house = houseDerictor.constrctHouse();

        System.out.println("**********************************");

        HouseDerictor houseDerictor1 = new HouseDerictor(new HighBuilder());
        House house1 = houseDerictor1.constrctHouse();


    }
}
