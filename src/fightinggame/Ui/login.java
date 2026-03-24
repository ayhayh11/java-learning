package fightinggame.Ui;

import fightinggame.domain.User;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
    public void start() {//登录主页面
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到英雄之塔");
            System.out.println("╔════════════════════════════════╗");
            System.out.println("      🎮 欢迎来到英雄之塔🎮        ");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("请选择操作：1登录 2注册 3退出");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> {
                    System.out.println("退出游戏");
                    System.exit(0);
                }
                default -> System.out.println("输入错误");
            }
        }
    }

    public void login(ArrayList<User> list) {
        System.out.println("开始游玩吧~");
    }

    public void register(ArrayList<User> list) {
        System.out.println("欢迎加入我们！");
        //1.创建用户(空参)
        User u = new User();
        //2.键盘录入用户名
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            //   校验用户名
            /*用户名唯一
             开发细节：先验证格式，在验证唯一性；
                * 长度必须在3 ~ 16位
                * 只能由字母、数字组成，不能是纯数字*/
            if (!checklen(16, 3, username)) {
                System.out.println("只能3-16位请从新输入");
                continue;
            }
            if (!checkusername(username)) {
                System.out.println("只能由字母、数字组成，不能是纯数字");
                continue;
            }
            if(contains(list,username)){
                System.out.println("用户名已存在请重新输入");
                continue;
            }
            //    u.setUsername(username);
            u.setUsername(username);
            break;
        }

        while (true) {
            //3.键盘录入密码
            System.out.println("请输入密码：");
            String password1 = sc.next();
            System.out.println("请再次输入密码：");
            String password2 = sc.next();
            //   校验密码
            if(!password1.equals(password2)){
                System.out.println("密码不一致请重新输入");
                continue;
            }
            if(!checklen(8, 3, password1)){
                System.out.println("密码格式错误请重新输入");
                continue;
            }
            if(checkpassword(password1)){
                System.out.println("密码格式错误请重新输入");
            }
            u.setPassword(password1);
            break;
        }

        //4.将用户添加到集合当中
        list.add( u);
        System.out.println("注册成功");


    }

    public int[] getcount(String user) {
        int charcount = 0;
        int numcount = 0;
        int othercount = 0;
        for (int i = 0; i < user.length(); i++) {
            char c = user.charAt(i);
            if (c >= 'a' && c <= 'z') {
                charcount++;
            }
            if (c >= '0' && c <= '9') {
                numcount++;
            }
            if (c >= 'A' && c <= 'Z') {
                othercount++;
            }
        }
        return new int[]{charcount, numcount, othercount};
    }

    public boolean checkusername(String username) {
        int arr[] = getcount(username);
        return arr[0] > 0 && arr[1] >= 0 && arr[2] == 0;
    }

    public boolean checkpassword(String password) {
        int arr[] = getcount(password);
        return arr[0] > 0 && arr[1] > 0 && arr[2] == 0;
    }

    public boolean checklen(int maxlen, int minlen, String str) {
        return str.length() >= minlen && str.length() <= maxlen;
    }

    public boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return true;
            }

        }
        return false;
    }
}
