package OopTest.interfacetest2;

public class Ppplayer extends player implements Say{
    public Ppplayer() {
    }

    public Ppplayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("学习乒乓球");

    }

    @Override
    public void say() {
        System.out.println("说英语");
    }
}
