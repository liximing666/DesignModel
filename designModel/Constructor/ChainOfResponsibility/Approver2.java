package designModel.Constructor.ChainOfResponsibility;

public class Approver2 extends Approver {

    public Approver approver;

    @Override
    public void handelRequest(int count) {
        if (count <= 2000) {
            System.out.println("approver2 处理了");
        }else {
            approver.handelRequest(count);
        }
    }

    public Approver2(Approver approver) {
        this.approver = approver;
    }
}
