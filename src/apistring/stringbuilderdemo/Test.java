package apistring.stringbuilderdemo;

public class Test {
    public static void main(String[] args) {
     /*   StringBuilder的构造方法:
        public StringBuilder()  空参构造
        public StringBuilder (String str)带参构造

        StringBuilder的常见成员方法:
        append(任意类型)添加数据
        reverse()反转
        int length ()获取长度
        tostring变回字符串*/
        StringBuilder sb = new StringBuilder("abc");
        //sb.append("bbb");
        sb.reverse();
        int len =sb.length();
        System.out.println( len);
        String s = sb.toString();
        System.out.println(s);
        System.out.println(sb);





    }
}
