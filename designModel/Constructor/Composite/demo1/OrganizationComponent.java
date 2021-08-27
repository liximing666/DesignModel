package designModel.Constructor.Composite.demo1;
//抽象机构， 大学 学院 组织 都是 机构
public abstract class OrganizationComponent {
    private String name;
    private String des;

    protected void add (OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    };

    protected void remove (OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    };

    public abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
