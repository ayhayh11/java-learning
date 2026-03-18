package OopTest.ooppolymorphism.Test2;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String bound, double speed) {
        super(bound, speed);
    }

    @Override
    public void move() {
            System.out.println(getBound()+"的汽车"+getSpeed()+"的速度移动");
    }

    public void honk(){
        System.out.println("嘀嘀嘀");
    }
}
