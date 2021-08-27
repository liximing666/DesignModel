package designModel.Creator.Single;

//懒汉式 （双重检查） 实际开发推荐使用
public class Single5 {
    public static void main(String[] args) {

        God instance = God.getInstance();

        System.out.println(instance.toString());

    }

}

class God {

    private String name = "alice";

    private God() {
    }

    //即时更新的变量
    private static volatile God god = null;


    public static God getInstance() {

        if (god == null) {

            synchronized ("mutex") { //双重检查 ，实时更新
                if (god == null) {
                    god = new God(); //一旦创建，立即修改null
                }
            }
        }
        return god;

    }

    @Override
    public String toString() {
        return "God{" +
                "name='" + name + '\'' +
                '}';
    }
}
