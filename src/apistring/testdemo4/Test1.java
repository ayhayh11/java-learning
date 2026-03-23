package apistring.testdemo4;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //字符串的遍历
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s=sc.next();
        for (int i = 0; i < s.length(); i++) {
            char chr=s.charAt(i);
            System.out.println(chr);
        }
    }
}
