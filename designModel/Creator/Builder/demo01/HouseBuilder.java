package designModel.Creator.Builder.demo01;
//抽象建造的流程
public abstract class HouseBuilder {
     protected House house = new House();

     //抽象构造产品每一个部分的流程
    public abstract void buildBasied();

    public abstract void buildWall();

    public abstract void buildroofed();


    //交付建设好的产品
    public House buildHouse(){
        return house;
    };





}
