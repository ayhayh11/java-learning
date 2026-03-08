package ifdemo;

import java.util.Scanner;

public class ifdemo10 {
    public static void main(String[] args) {
        /*
         * 输入变量X,Y，判断点所在的坐标系
         * （第一象限，第二象限，第三象限，第四象限，坐标轴）
         * （0，0）点
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入X：");
        double x=sc.nextDouble();
        System.out.println("请输入Y：");
        double y=sc.nextDouble();
        if(x!=0||y!=0){
            if(x==0&&y!=0){
                System.out.println("在y轴上");
            }
            else if(x!=0&&y==0){
                System.out.println("在x轴上");
            }
            else if(x>0&&y>0){
                System.out.println("第一象限");
            }
            else if(x<0&&y>0){
                System.out.println("第二象限");
            }
            else if(x<0&&y<0){
                System.out.println("第三象限");
            }
            else{
                System.out.println("第四象限");
            }
        }
        else{
            System.out.println("在原点上");
        }

    }
}
