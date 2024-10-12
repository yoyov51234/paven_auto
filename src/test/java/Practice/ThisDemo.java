package Practice;

import net.bytebuddy.asm.Advice;

public class ThisDemo extends Object{
    static String demoName;
    static int age;

    public ThisDemo(String demoName, int age){
        this.demoName= demoName;
        this.age=age;

    }



    public static void main(String[] args) {
        ThisDemo thisDemo= new ThisDemo("xiaoli",12);
        System.out.println(thisDemo.demoName);
        // 所以这里是从obejct 来访问demoname  和age的， 并不是通过类直接访问； 所以 我的类里面 可以直接用private, default ,protected都行， 不一定要是static的
        System.out.println(thisDemo.age);

    }


}
