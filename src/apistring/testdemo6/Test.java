package apistring.testdemo6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /* String replace(I旧值,新值) 替换
        注意点:只有返回值才是替换之后的结果
        需求:
        过滤玩游戏中骂人的脏话*/
        String sentence = "你真tmd的菜";
        String newSentence = sentence.replace("tmd","***");
        System.out.println(newSentence);
        String[] arr={"tmd","cnm","lj"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入语句：");
        String mr = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            mr = mr.replace(arr[i],"***");
        }
        System.out.println(mr);
    }
}
