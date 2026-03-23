package apistring.testdemo3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*boolean equals方法 (要比较的字符串) 完全一样结果才是true，否则为false
        boolean equalsIgnoreCase (要比较的字符串) 忽略大小写的比较

        练习:
        已知正确的用户名和密码，请用程序实现模拟用户登录
        总共给三次机会，登录之后，给出相应的提示*/
        String rightusername = "admin";
        String rightpassword = "12345";
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            boolean result = username.equals(rightusername) && password.equals(rightpassword);
            if(result){
                System.out.println("登录成功");
            }
            else{
               if(i<=2){
                   System.out.println("用户名或密码错误剩余"+(3-i)+"次机会");
               }
               else{
                   System.out.println("账户"+username+"已锁定");
               }
            }
        }

    }
}
