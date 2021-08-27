package designModel.Creator.Builder.demo01;

//指挥者负责指挥具体的builder 造产品

public class HouseDerictor {
    HouseBuilder houseBuilder;

    //把一个具体的子类传给指挥者
    public HouseDerictor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    //指挥建设房子的流程
    public House constrctHouse() {
        this.houseBuilder.buildBasied();
        this.houseBuilder.buildWall();
        this.houseBuilder.buildroofed();

        return this.houseBuilder.buildHouse();
    }

}
