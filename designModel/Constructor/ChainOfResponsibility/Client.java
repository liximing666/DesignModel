package designModel.Constructor.ChainOfResponsibility;

//职责链模式 把个个处理者通过 组合 方式串联在一起，形成职责链
//比如采购物品 不同采购金额 不同级别人审批（传统if else判断 耦合性太强）

public class Client {
    public static void main(String[] args) {



        Approver3 approver3 = new Approver3();

        Approver2 approver2 = new Approver2(approver3);

        Approver1 approver1 = new Approver1(approver2);

        Request request = new Request(approver1);

        request.purchase(8000);


    }
}
