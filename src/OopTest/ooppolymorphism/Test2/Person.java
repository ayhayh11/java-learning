package OopTest.ooppolymorphism.Test2;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void drive(Vehicle vehicle) {
        vehicle.move();
        if (vehicle instanceof Bicycle) {
            Bicycle b = (Bicycle) vehicle;
            b.ringBell();
        } else if (vehicle instanceof Car) {
            Car c = (Car) vehicle;
            c.honk();
        }else {
            System.out.println("不能开这种车辆");
        }
    }
}
