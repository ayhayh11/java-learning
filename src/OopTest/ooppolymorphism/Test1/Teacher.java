package OopTest.ooppolymorphism.Test1;

public class Teacher extends  Person{
    public Teacher() {
    }

    public Teacher(String name, int password, int username) {
        super(name, password, username);
    }

    @Override
    public void work() {
        System.out.println("老师正在上课");
    }
}
