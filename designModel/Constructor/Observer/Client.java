package designModel.Constructor.Observer;




//观察者模式 类似于订购牛奶的用户和奶站的关系，奶站给用户推送信息，在一对多的关系下比较适用（内部维护一个用户用户集合）
//观察者模式 可以随意添加、移除观察者，扩展性，灵活性好

public class Client {
    public static void main(String[] args) {

        WetherData wetherData = new WetherData(100, 100, 100);

        Platform platform1 = new Platform("platform1");
        Platform platform2 = new Platform("platform2");
        Platform platform3 = new Platform("platform3");


        wetherData.regiter(platform1);
        wetherData.regiter(platform2);
        wetherData.regiter(platform3);


        wetherData.changeData(10, 20, 30);

        wetherData.changeData(66, 666, 66666);

        Baidu baidu = new Baidu();

        wetherData.regiter(baidu);

        wetherData.changeData(1,2,3);


    }
}
