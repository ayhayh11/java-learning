package OopTest.oopextendstest5;

public class Teacher extends Person{
    String subject;

    public Teacher() {
    }

    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }
}
