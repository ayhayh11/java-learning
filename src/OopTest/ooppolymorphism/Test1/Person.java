package OopTest.ooppolymorphism.Test1;

public class Person {
    private String name;
    private int username;
    private int password;

    public Person() {
    }

    public Person(String name, int password, int username) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }
    public void work(){
        System.out.println("");
    }
}
