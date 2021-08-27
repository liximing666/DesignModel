package designModel.Constructor.Observer;

import java.util.ArrayList;
import java.util.List;

public final class WetherData implements WhetherDataInterface{
    //存数据
    private int tempture;
    private int humidity;
    private int feel;
    //存观察者的名单
    private List<BoardCast> boardCasts;

    public WetherData(int tempture, int humidity, int feel) {
        this.tempture = tempture;
        this.humidity = humidity;
        this.feel = feel;
        this.boardCasts = new ArrayList<BoardCast>();
    }

    @Override
    public void regiter(BoardCast boardCast) {
        this.boardCasts.add(boardCast);
    }

    @Override
    public void remove(BoardCast boardCast) {
        this.boardCasts.remove(boardCast);
    }

    @Override
    public void notifyBordCast() {
        for (BoardCast b: this.boardCasts
             ) {
            b.update(tempture, humidity, feel);
        }
    }

    public void changeData(int t, int h, int f) {
        //更新数据
        this.tempture = t;
        this.humidity = h;
        this.feel = f;
        notifyBordCast();
    }
}
