package OopTest.interfacetest2;

public abstract class player extends  Person{
    public player() {
    }

    public player(int age, String name) {
        super(age, name);
    }
    public  abstract void study();
}
