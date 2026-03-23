package apistring.testdemo4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符
        数字字符出现的次数(不考虑其他字符)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >='A' && ch <= 'Z') {
                count1++;
            } else if (ch >= 'a' && ch<= 'z') {
                count2++;
            } else if (ch >= '1' && ch<= '9') {
                count3++;
            }
            else{
                System.out.println("当前字符不参与统计" );
            }
        }
        System.out.println("大写字母出现的次数为：" + count1);
        System.out.println("小写字母出现的次数为：" + count2);
        System.out.println("数字出现的次数为：" + count3);
    }
}
