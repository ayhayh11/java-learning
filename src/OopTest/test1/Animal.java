package OopTest.test1;

public abstract class Animal {
    private String name;
    private  String color;

    public Animal() {
    }

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  abstract void eat();
}
