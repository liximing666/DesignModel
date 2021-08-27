package designModel.Constructor.Composite.demo;

import java.util.ArrayList;
import java.util.List;

public class Bank extends Thing implements change{


    List<Thing> userList = new ArrayList<Thing>();

    public Bank(String name) {
        super(name);
    }

    @Override
    public void add(Thing t) {
        this.userList.add(t);
    }

    @Override
    public void remove(Thing t) {
        this.userList.remove(t);
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println("---------------------");

        for (Thing t: userList
             ) {
            System.out.println(t.getName()+"*****"+ t.getMoney() );
        }
    }
}
