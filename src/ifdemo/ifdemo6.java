package ifdemo;

import java.util.Scanner;

public class ifdemo6 {
    public static void main(String[] args) {
   /*     现在在某电商平台网购有以下优惠卷
        满10减8
        满50减30
        满100减50
        满200减90
    会员卡全场8折
    请问会员卡和优惠卷不能同时使用（优惠券只能使用一张）
        那最优惠的价格和方案是多少；
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入花费金额：");
        double price=sc.nextDouble();
        double discount=1;
        if(price>0){
            if(price<10){
                discount=price;
            } else if (price<50) {
                discount=price-8;
            } else if (price<100) {
                discount=price-30;
            } else if (price<200) {
                discount=price-50;
            }
            else{
                discount=price-90;
            }
        }
        else{
            System.out.println("金额错误");
        }
        System.out.println("优惠卷优惠后价格为："+discount);
        double discount2=price*0.8;
        System.out.println("会员卡优惠后价格为"+discount2);
        if(discount<discount2){
            System.out.println("优惠券更优惠");
        }
        else{
            System.out.println("会员卡更优惠");
        }

    }
}
