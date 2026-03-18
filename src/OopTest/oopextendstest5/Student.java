package OopTest.oopextendstest5;

public class Student extends Person {
    String grade;

    public Student() {
        System.out.println("子类无参构造");
    }

    public Student(int age, String name, String grade) {
        super(age, name);
        this.grade = grade;
        System.out.println("子类有参构造");
    }
}
