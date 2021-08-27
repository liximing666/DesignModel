package designModel.Constructor.ChainOfResponsibility;

public class Request {
    public Approver approver;

    public Request(Approver approver) {
        this.approver = approver;
    }

    public void purchase(int count) {
        approver.handelRequest(count);
    }
}
