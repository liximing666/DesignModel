package designModel.Constructor.Observer;

public class Platform implements BoardCast{

    private String name;
    private int tempture;
    private int humidity;
    private int feel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Platform(String name) {
        this.name = name;
    }

    public int getTempture() {
        return tempture;
    }

    public void setTempture(int tempture) {
        this.tempture = tempture;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getFeel() {
        return feel;
    }

    public void setFeel(int feel) {
        this.feel = feel;
    }

    private void dispaly() {
        System.out.println(this.getName());
        System.out.println("tempture: " + tempture);
        System.out.println("humidity: " + humidity);
        System.out.println("feel: " + feel);
    }

    //接收气象台发来的数据并且展示
    @Override
    public void update(int t, int h, int f) {
        //同步数据
        this.tempture = t;
        this.humidity = h;
        this.feel = f;
        dispaly();
    }


}
