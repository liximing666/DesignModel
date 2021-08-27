package designModel.Constructor.Observer;

import java.awt.*;

public class Baidu implements BoardCast{

    private int tempture;
    private int humidity;
    private int feel;



    @Override
    public void update(int t, int h, int f) {
        this.tempture = t;
        this.humidity = h;
        this.feel = f;

        display();
    }

    private void display() {
        System.out.println("baidu");
        System.out.println("tempture: " + tempture);
        System.out.println("humidity: " + humidity);
        System.out.println("feel: " + feel);

    }


}
