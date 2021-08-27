package designModel.Constructor.ChainOfResponsibility;

public class Approver3 extends Approver{


    @Override
    public void handelRequest(int count) {

        System.out.println("approver3 处理了");

    }
}
