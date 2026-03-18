package OopTest.oopextendshomework.HomeWork1;

public class Maneger extends  Employ{
    public Maneger() {
    }

    public Maneger(String name, int number, double salary) {
        super(name, number, salary);
    }

    @Override
    public void work() {
        System.out.println("管理");
    }
}
