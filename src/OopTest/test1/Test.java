package OopTest.test1;

public class Test {
    public static void main(String[] args) {
        /*青蛙狗兔子
        属性:名字，颜色行为:吃虫子，蛙泳
        属性:名字，颜色行为:吃骨头，狗刨
        属性:名字，颜色行为:吃胡萝卜*/
        Frog f=new Frog("frog","green");
        System.out.println(f.getColor()+" "+f.getName());
        f.eat();
        f.swim();
    }
}
