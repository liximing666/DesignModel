package designModel.Creator.Builder.demo01;

public class HighBuilder extends HouseBuilder{
    @Override
    public void buildBasied() {
        System.out.println("高楼大厦，打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼大厦，建墙");
    }

    @Override
    public void buildroofed() {
        System.out.println("高楼大厦，封屋顶");
    }
}
