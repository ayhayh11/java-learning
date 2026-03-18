package OopTest.ooppolymorphism.Test2;

public class Vehicle {
    private String bound;
    private double speed;
    public Vehicle() {
    }
    public Vehicle(String bound, double speed) {
        this.bound = bound;
        this.speed = speed;
    }

    public String getBound() {
        return bound;
    }

    public void setBound(String bound) {
        this.bound = bound;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public  void move(){
        System.out.println("移动");
    }
}
