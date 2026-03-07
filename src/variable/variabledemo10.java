package variable;

import java.util.Scanner;

public class variabledemo10 {
    public static void main(String[] args) {
       // 键盘录入一个三位数，将他个位，十位，百位分别打印出来。
     Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        System.out.println("个位数"+ ge);
        System.out.println("十位数"+ shi);
        System.out.println("百位数"+ bai);
        //四位数
       /* Scanner sc = new Scanner(System.in)
        System.out.println("请输入一个四位数：");
        int num = sc.nextInt();
        int ge = num%10;
        int shi= num/10%10;
        int bai = num/100%10;
        int qian = num/1000;*/

    }
}
