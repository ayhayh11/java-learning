package apistring.stringbuilderdemo;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
     /*   键盘录入任意字符串，请按长度为8拆分每个输入字符申并进行输出
        长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
        举例:
        输入:
        abcdabcda
        输出:
        第一行:
        abcdabcd
        第二行:
        a0000000*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        int length = s.length()%8;
        int count =8-length;
        if(count!=0){
           s=s+ "00000000".substring(0,count);
        }
        for (int i = 0; i < s.length(); i+=8) {
            String substring = s.substring(i, i + 8);
            System.out.println(substring);
        }
    }
}
