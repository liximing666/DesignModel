package designModel.Creator.Factory.simple;

public class CarFactory {
    public static Car getCar(String s){

        if (s == "wulin") {
            return new Wulin();
        }else if (s == "benz") {
            return new Benz();
        }else if (s == "dazhong") {
            return new Dazhong();
        }
        return null;

    }
}
