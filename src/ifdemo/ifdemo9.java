package ifdemo;

import java.util.Scanner;

public class ifdemo9 {
    public static void main(String[] args) {
     /*   输入三个数，判断这三个数构成什么三角形
    （等腰，等边，直角，普通，不能构成三角形）；
        三角形任意两边之和大于第三边*/
        //1.键盘录入三个数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数：");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a){
            if(a==b&&b==c&&c==a){
                System.out.println("等边三角形");
            }
            else if(a==b||b==c||c==a){
                System.out.println("等腰三角形");
            }
            else if(a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a==b*b){
                System.out.println("直角三角形");
            }
            else {
                System.out.println("普通三角形");
            }
        }
        else {
            System.out.println("不能构成三角形");
        }
    }
}
