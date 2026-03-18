package OopTest.oopextendstest5;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("子类无参构造方法");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("父类有参构造方法");
    }
}
