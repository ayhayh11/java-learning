package apistring.stringbuilderdemo;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        //定义一个任意内容的字符串，打乱内容；
        String s = "abcd";
        char[] chs = s.toCharArray();
        Random r = new Random();
        for (int i = 0; i < chs.length; i++) {
            int index = r.nextInt(chs.length);
            char temp = chs[i];
            chs[i] = chs[index];
            chs[index] = temp;
        }
        String newS = new String(chs);
        System.out.println(newS);
    }
}
