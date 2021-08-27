package designModel.Creator.Prototype.demo01;

import java.util.Date;

public class Video implements Cloneable {

    private String name = "aaa";
    private Date creatTime = getCreatTime();

    @Override
    protected Video clone() throws CloneNotSupportedException {
        Video v = (Video)super.clone();
        v.creatTime = (Date) this.creatTime.clone();

        return v;
    }

    public Video(String name) {
        this.name = name;
    }

    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }
}
