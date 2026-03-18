package OopTest.ooppolymorphism.Test1;

public class Admin  extends  Person{
    public Admin() {
    }

    public Admin(String name, int password, int username) {
        super(name, password, username);
    }

    @Override
    public void work() {
        System.out.println("管理网站");
    }
}
