package apistring.stringbuilderdemo;

import OopTest.OopToolclass.ArrayUtils;

public class Test6 {
    public static void main(String[] args) {
       /* 定义两个字符申，记录为非负整数，求它们的和。
        输入:"12395" 和 "133"，输出i:"12528"
        注意:需要数据过大，超出int取值范围的情况*/
        //创建两个字符申
        String s1 = "12395";
        String s2 = "133";
        //2.把字符申转换成字符数组
        int len = s1.length() > s2.length() ? s1.length() : s2.length();
        int[] arr1 = copydata(s1, len);
        int[] arr2 = copydata(s2, len);
        int[] arr3 = new int[len + 1];
        int num = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            int n1 = arr1[i];
            int n2 = arr2[i];
            int sum = n1 + n2 + num;
            arr3[i + 1] = sum % 10;
            num = sum / 10;
        }
        arr3[0] = num;
        StringBuilder sb = new StringBuilder();
        if (arr3[0] != 0) {
            sb.append(arr3[0]);
        }
        for (int i = 1; i < arr3.length; i++) {
            sb.append(arr3[i]);
        }

        System.out.println(sb);

    }

    public static int[] copydata(String str, int len) {
        int[] arr = new int[len];
        int index = arr.length - 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int num = ch - '0';
            arr[index] = num;
            index--;
        }
        return arr;
    }
}
