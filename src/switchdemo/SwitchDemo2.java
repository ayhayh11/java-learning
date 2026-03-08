package switchdemo;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //case，defalut如果没有break，会继续执行下一个case（case穿透）
        //case穿透的应用
       /* 根据用户输入月份，输出季节；
        3-5：春季
        6-8：夏季
        9-11：秋季
        12-2：冬季*/
        //1.创建键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        //利用swtich进行月份判断
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("没有这个月份");
                break;


        }

    }
}
