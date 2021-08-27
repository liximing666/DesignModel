package designModel.Creator.Builder.demo01;

//实现一个具体的建造者
public class CommenBuilder extends HouseBuilder{
    @Override
    public void buildBasied() {
        System.out.println("普通房子，打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子，建墙");
    }

    @Override
    public void buildroofed() {
        System.out.println("普通房子，封屋顶");
    }
}
