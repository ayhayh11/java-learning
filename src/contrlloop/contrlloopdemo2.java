package contrlloop;

import java.util.Scanner;

public class contrlloopdemo2 {
    public static void main(String[] args) {
        //找质数：键盘录入一个大于2的整数，判断是否是质数；
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("请输入大于2的整数：");
            a = sc.nextInt();
            if (a > 2) {
                break;
            } else {
                System.out.println("请重新输入大于2的整数：");
            }
        }
        //判断是否为质数
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("不是质数");
                break;
            }
            System.out.println("是质数");
        }
    }
}
