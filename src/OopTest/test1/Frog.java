package OopTest.test1;

public class Frog extends  Animal implements Swim{
    public Frog() {
    }

    public Frog(String color, String name) {
        super(color, name);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
