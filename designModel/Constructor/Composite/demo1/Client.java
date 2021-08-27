package designModel.Constructor.Composite.demo1;
//组合模式  一个类中可以组合另一个个类，一个或者多个 多个用list存，提供add remove方法，扩展性强
public class Client {
    public static void main(String[] args) {

        OrganizationComponent university = new University("qinhua","");
        OrganizationComponent collge1 = new Collage("stu","");
        OrganizationComponent collge2 = new Collage("fudan","");

        university.add(collge1);
        university.add(collge2);

        university.print();

        Department department1 = new Department("cs", "");
        Department department2 = new Department("software", "");

        collge1.add(department1);
        collge1.add(department2);

        collge1.print();




    }
}
