package OopTest.test1;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String color, String name) {
        super(color, name);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }
}
