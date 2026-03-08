package ifdemo;

import java.util.Scanner;

public class ifdemo7 {
/*    现有会员卡充值制度如下：
    充值1000送200
    充值2000送500
    充值3000送700
    充值5000送1300
    充值10000送2500
   充值20000送5000
    充值50000送15000
    计算充值不同额度卡里余额*/
public static void main(String[] args) {
    //创建键盘输入
    Scanner sc =new Scanner(System.in);
    System.out.println("请输入充值金额");
    double num=sc.nextDouble();
    double result=0;
    //判断充值金额是否合理
    if(num>0){
        //判断充值金额
        if(num<1000){
            result=num;
        } else if (num<2000) {
            result=num+200;
        }
        else if (num<3000) {
            result=num+500;
        }
        else if (num<5000) {
            result=num+700;
        }
        else if (num<10000) {
            result=num+1300;
        }
        else if (num<20000) {
            result=num+2500;
        }
        else if (num<50000) {
            result=num+5000;
        }
        else{
            result=num+15000;
        }
        System.out.println("充值后的余额为："+result);
    }
    else{
        System.out.println("充值金额必须大于0");
    }

}
}
