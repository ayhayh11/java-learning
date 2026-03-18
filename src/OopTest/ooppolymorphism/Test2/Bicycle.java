package OopTest.ooppolymorphism.Test2;

public class Bicycle extends  Vehicle{
    public Bicycle() {
    }

    public Bicycle(String bound, double speed) {
        super(bound, speed);
    }

    @Override
    public void move() {
        System.out.println(getBound()+"的自行车"+getSpeed()+"的速度移动");
    }

    public void ringBell(){
        System.out.println("铃铃铃");
    }
}
