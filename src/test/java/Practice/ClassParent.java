package Practice;

public class ClassParent {

    private final String name;
    private final int age;

    public ClassParent(String name, int age){
        this.name= name;
        this.age = age;
    }

    private  ClassParent(String name){
     this(name,19);
    }

    protected  ClassParent(){
        this("unknown", 18);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ClassParent c= new ClassParent("xiaohei");
        System.out.println(c.getName());


    }

}
