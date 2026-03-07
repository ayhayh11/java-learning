package variable;

import java.util.Scanner;

public class variabledemo7 {
    public static void main(String[] args) {
        //键盘录入两个整数类型变量并打印；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 =sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入第二个整数：");
        int num2 =sc.nextInt();
        System.out.println(num2);
        //求和
        int sum = num1 + num2;
        System.out.println("两个数的和为："+sum);
    }
}
