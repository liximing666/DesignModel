package designModel.Constructor.ChainOfResponsibility;

public class Approver1 extends Approver{

    //下一级处理者角色
    public Approver approver;

    //本级别的处理方法
    @Override
    public void handelRequest(int count) {
        if (count <= 1000) {
            System.out.println("approver1 处理了");
        }else {
            approver.handelRequest(count);
        }
    }

    public Approver1(Approver approver) {
        this.approver = approver;
    }
}
