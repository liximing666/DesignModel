package designModel.Constructor.Composite.demo1;

import java.util.ArrayList;
import java.util.List;
//学院
public class Collage extends OrganizationComponent{

    //一个学院可以管理很多系，存系的list
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();



    public Collage(String name, String des) {
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
    public void print() {
        System.out.println(getName());

        for (OrganizationComponent o: organizationComponents
             ) {
            System.out.println(o.getName());
        }

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
