package Practice;

public class Person {
    private String name;
    private int age;
    private String email;
    private String address;

    // 私有构造函数，强制使用Builder来创建Person对象
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    // Person的静态内部类Builder
    public static class PersonBuilder {
        private String name;
        private int age;
        private String email;
        private String address;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;  // 返回当前对象的引用，以便链式调用
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);  // 使用当前Builder构建Person对象
        }
    }

    // Person类的方法，例如getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

 class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setName("John Doe")
                .setAge(30)

                .build();
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }
}
