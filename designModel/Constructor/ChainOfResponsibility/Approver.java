package designModel.Constructor.ChainOfResponsibility;

public abstract class Approver {

    public Approver approver;

    public abstract void handelRequest(int count);


}
