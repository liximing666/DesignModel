package designModel.Creator.Prototype.demo01;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Video video1 = new Video();
        Video video2 = video1.clone();


        System.out.println(video2.toString());
    }
}
