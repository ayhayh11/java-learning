package ifdemo;

import java.util.Scanner;

public class ifdemo4 {
    /*比较哪个平台优惠力度大
    已知美团满30减10
    饿了吗全场9折
    1.小明买了50元外卖，请问在哪买更何合适
    2.如果数据不给定，由键盘输入呢
     */
    public static void main(String[] args) {
        //1.小明消费50元
        //double cost=50;
        //2.键盘录入
        Scanner sc=new Scanner(System.in);
        double cost=sc.nextDouble();
        double cost2=0;
        if(cost>=30){
            cost2=cost-10;
            System.out.println("美团优惠了10元，还剩"+cost2+"元");
        }
        else {
            cost2=cost;
            System.out.println("美团没有优惠，还剩"+cost2+"元");
        }
         double elm=cost*0.9;
        System.out.println("饿了吗优惠了9折，还剩"+elm+"元");
        if(elm<cost2){
            System.out.println("饿了吗更便宜");
        }
        else {
            System.out.println("美团更便宜");
        }
    }
}
