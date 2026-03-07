package variable;

import java.util.Scanner;

public class variabledemo8 {
    public static void main(String[] args) {
        //bmi=体重/身高的平方
        //键盘录入体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重（单位：千克）：");
        double weight = sc.nextDouble();
        //键盘录入身高
        System.out.println("请输入身高(单位：米)：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("bmi="+bmi);
    }
}
