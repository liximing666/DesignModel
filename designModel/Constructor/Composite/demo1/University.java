package designModel.Constructor.Composite.demo1;


import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

    //一个大学可以管理很多个学院，存学院的list
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();



    public University(String name, String des) {
        super(name, des);
    }


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        this.organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        this.organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    //输出大学里面所包含的院校
    public void print() {
        System.out.println(this.getName());

        for (OrganizationComponent o : organizationComponents
             ) {
            System.out.println(o.getName());
        }
    }
}
