package apistring.testdemo5;

public class Test1 {
    public static void main(String[] args) {
   /*     public String substring(int beginIndex, int endIndex):截取指定范围
        public String substring(int beginIndex):              截取到末尾

        需求:只保留用户名的第一个字符，后面用三个***替代*/
        String username = "lisi";
        //charat(0)
       char chr= username.charAt(0);
       String s = "***";
       String newusername = chr+s;
       System.out.println(newusername);
       //substring(0,1)
        String str=username.substring(0,1);
        String newusername1 = str+"***";
        System.out.println(newusername1);
    }
}
