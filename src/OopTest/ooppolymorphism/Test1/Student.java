package OopTest.ooppolymorphism.Test1;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int password, int username) {
        super(name, password, username);
    }

    @Override
    public void work() {
        System.out.println("学习");
    }
}
