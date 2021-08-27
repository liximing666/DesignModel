package designModel.Constructor.Template;

public abstract class AbstractStep {

    public abstract void step1(String s);
    public abstract void step2(String s);
    public abstract void step3(String s);
    public abstract void step4(String s);


    public void template(String s1,String s2,String s3,String s4) {
        step2(s2);
        step1(s1);
        step4(s4);
        step3(s3);
    }


}
