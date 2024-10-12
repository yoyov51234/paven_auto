package Practice;

import org.checkerframework.checker.units.qual.C;

public class ConstructorTask1 {

    public String name;

    public  ConstructorTask1(){
        this.name="zhixia";

    }

    public static void main(String[] args) {

        ConstructorTask1 task1= new ConstructorTask1();
        System.out.println(task1.name);
    }
}
