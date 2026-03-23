package apistring.stringbuilderdemo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*键盘录入字符串，将该字符串进行反转，当输入拜拜的时候程序停止运行
        例如，键盘录入abc，输出结果cba*/
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个字符串：");
            String s = sc.next();
            boolean result = s.equals("拜拜");
            if (result) {
                System.out.println("程序已结束");
                break;
            } else {
                StringBuilder sb = new StringBuilder(s);
                sb.reverse();
                String s1 = sb.toString();
                System.out.println(s1);
            }

        }

    }
}
