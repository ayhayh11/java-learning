package ifdemo;

import java.util.Scanner;

public class ifdemo5 {
   /* 练习
   卡拉兹函数(Collatzfunction)定义如下:给定正整数n，
    若n为奇数，则f(n)=3n+1
    若n为偶数，则f(n)=n/2
    示例1:
    输入:1
    说明:奇数，3*1+1=4
    输出:4
    示例2:
    输入:2
    说明:偶数，2/2=1
    输出:1
    */
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入一个正整数：");
      int n = sc.nextInt();
      int count = 0;
      //判断是否正整数
      if(n>0){
         //判断是否为奇数
         if(n%2>0){
            count=3*n+1;
         }
         else{
            count=n/2;
         }
         System.out.println(count);

      }
      else{
         System.out.println("请输入正整数");
      }

   }

}
