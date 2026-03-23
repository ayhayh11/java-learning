package apistring.Test2;

public class Test {
    public static void main(String[] args) {
        /*第一种:直接赋值
        第二种:new关键字
        public String()                  空白字符串，不含任何内容
        public String(String original)   根据传入的字符串，创建新的字符串对象
        public String(char[] chs)        根据字符数组，创建字符串对象
        public String(byte[] chs)        根据字节数组，创建字符串对象

      */
        //1.直接赋值
        String s1 = "hello";
        System.out.println(s1);
        //2.new+空参构造
        String s2 = new String();
        System.out.println("%%"+s2+"@@");
        //3.new+有参构造
        String s3 = new String(s1);
        System.out.println(s3);
        //4.new+字符数组构造
        char[] chs={'a','b','c','d','e'};
        String s4 = new String(chs);
        System.out.println(s4);
        //5.new+字节数组构造
        byte[] bytes = {97,98,99,100,101};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
