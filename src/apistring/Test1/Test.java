package apistring.Test1;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r=new Random();
       double num1= r.nextDouble();
        System.out.println(num1);
        double num2=r.nextDouble(1.9);

        System.out.println(num2);
    }
}
