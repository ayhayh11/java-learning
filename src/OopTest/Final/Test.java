package OopTest.Final;

public class Test {
    public static void main(String[] args) {
       /* 用Javabean类定义一个圆：
        属性：半径，圆周率；
        行为：求圆面积，求圆周长；*/
        circle c = new circle(1.5);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

    }
}
