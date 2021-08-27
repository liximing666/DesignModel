package designModel.Constructor.Adapter;

public class Adapt implements Adepter{

    //组合的方式把两个类发生联系（另一种是继承）
    NetLine netLine = null;
    public Adapt(NetLine netLine) {
        this.netLine = netLine;
    }


    @Override
    public void handleRequest() {

        this.netLine.request();
    }


}
