package OopTest.oopextendshomework.HomeWork1;

public class Cook extends  Employ{
    public Cook() {
    }

    public Cook(String name, int number, double salary) {
        super(name, number, salary);
    }

    @Override
    public void work() {
        System.out.println("做菜");
    }
}
