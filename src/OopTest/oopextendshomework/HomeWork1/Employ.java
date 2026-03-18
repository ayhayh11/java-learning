package OopTest.oopextendshomework.HomeWork1;

public class Employ {
    private int number;
    private String name;
    private double salary;

    public Employ() {
    }

    public Employ(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void work(){
        System.out.println("工作");
    }
}
