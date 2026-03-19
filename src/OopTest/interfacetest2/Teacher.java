package OopTest.interfacetest2;

public abstract class Teacher extends  Person{
    public Teacher() {
    }

    public Teacher(int age, String name) {
        super(age, name);
    }
    public  abstract void teach();
}
