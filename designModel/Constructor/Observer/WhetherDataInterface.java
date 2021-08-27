package designModel.Constructor.Observer;

//抽象气象台的行为
public interface WhetherDataInterface {
    //增加、移除、通知观察者
    public void regiter(BoardCast boardCast);
    public void remove(BoardCast boardCast);
    public void notifyBordCast();

}
