package contrlloop;

import java.util.Random;
import java.util.Scanner;

public class breakdemo2 {
    public static void main(String[] args) {
        //随机生成一个1-100的数字，猜中则结束循环
        //随机数生成用
        //如果用户三次没猜中提示范围±5，如果十次没猜中直接告诉答案；
        Random r = new Random();
        int a = r.nextInt(1, 101);
        System.out.println(a);
        int count = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字：");
            int i = sc.nextInt();
            count++;
            if (count == 10) {
                i = a;
            }
            if (i > a) {
                System.out.println("太大了！");
            } else if (i < a) {
                System.out.println("太小了！");
            } else {
                System.out.println("猜对了！");
                break;
            }
           /* if(count>=3&&count<10)
            { System.out.println("范围"+(a-5)+"-"+(a+5));}
            if(count>=10){
                System.out.println("答案是："+a);}
                或者大保底猜到十次直接强制猜对*/
            if (count >=3) {
                System.out.println("范围" + (a - 5) + "-" + (a + 5));
            }
           /* if (count == 10) {
                i = a;
                //(需要放到上面，否则还会跑一遍循环)
            }*/
        }
    }
}


