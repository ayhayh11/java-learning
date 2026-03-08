package switchdemo;

import java.util.Scanner;

public class switchdemo1 {
    public static void main(String[] args) {
        /*录入今天是周几，显示今天的减肥活动；
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿*/
        //键盘录入
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入今天是周几：");
        int week=sc.nextInt();
        System.out.println("今天是星期："+week);
        switch (week) {
            case 1:
                System.out.println("今天是周一，请跑步");
                break;
            case 2:
                System.out.println("今天是周二，请游泳");
                break;
            case 3:
                System.out.println("今天是周3，请慢走");
                break;
            case 4:
                System.out.println("今天是周4，请动感单车");
                break;
            case 5:
                System.out.println("今天是周5，请拳击");
                break;
            case 6:
                System.out.println("今天是周6，请爬山");
                break;
            case 7:
                System.out.println("今天是周日，请大吃一顿吧");
                break;
            default:
                System.out.println("没有这一天");
                break;
        }

    }
}
