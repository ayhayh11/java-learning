package OopTest.Final;

public class circle {
    private final double PI = 3.14;
    private double r;
    public circle(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return PI * r * r;
    }

    public double getPerimeter() {
        return 2 * PI * r;
    }
}
