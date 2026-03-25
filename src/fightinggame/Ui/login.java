package fightinggame.Ui;

import fightinggame.domain.User;

import java.util.ArrayList;
import java.util.Random;
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
        System.out.println("欢迎英雄归来");
       /* 用户名如果未注册提示：用户名未注册，请先注册

     	用户被锁定提示：用户xxx已经锁定，请联系客服：XXX-XXXXX

     	验证码错误提示：验证码输入错误，请重新输入，并生成一个新的验证码

     	判断用户名和密码是否正确，有3次机会，满3次账户锁定。*/
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        if (!contains(list, username)) {
            System.out.println("用户名未注册，请先注册");
            return;
        }
        int findindex = findindex(list, username);
        User u = list.get(findindex);
        if (!u.isStatus()) {
            System.out.println("用户" + u.getUsername() + "已经锁定，请联系客服：XXX-XXXXX");
            return;
        }
        //用户输入密码和验证码进行验证；
        String rightpassword = u.getPassword();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            String password = sc.next();
            //每一次都要验证码
            while (true) {
                String rightcode = getCode();
                System.out.println("正确的验证码:" + rightcode);
                System.out.println("请输入验证码：");
                String code = sc.next();
                if (rightcode.equalsIgnoreCase(code)) {
                    System.out.println("验证码输入正确");
                    break;
                } else {
                    System.out.println("验证码输入错误，请重新输入");
                    continue;
                }
            }
            if (password.equals(rightpassword)) {
                System.out.println("登录成功，游戏启动");
                FightingGame fg = new FightingGame();
                fg.gamestart(username);
                return;
            }
            else{
                System.out.println("密码输入错误，请重新输入");
                if (i==2) {
                    u.setStatus( false);
                    System.out.println("用户" + u.getUsername() + "已经锁定，请联系客服：XXX-XXXXX");
                    return;
                }
                else {
                    System.out.println("密码输入错误，还有" + (2 - i) + "次机会");
                }
            }
        }
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
            if (contains(list, username)) {
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
            if (!password1.equals(password2)) {
                System.out.println("密码不一致请重新输入");
                continue;
            }
            if (!checklen(8, 3, password1)) {
                System.out.println("密码格式错误请重新输入");
                continue;
            }
            if (checkpassword(password1)) {
                System.out.println("密码格式错误请重新输入");
                continue;
            }
            u.setPassword(password1);
            break;
        }

        //4.将用户添加到集合当中
        list.add(u);
        System.out.println("注册成功");


    }

    public int[] getcount(String user) {
        int charcount = 0;
        int numcount = 0;
        int othercount = 0;
        for (int i = 0; i < user.length(); i++) {
            char c = user.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                charcount++;
            }
           else  if (c >= '0' && c <= '9') {
                numcount++;
            } else {
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

    //获取验证码
    public String getCode() {
       /* 长度为5

     	由4位大写或者小写字母和1位数字组成，同一个字母可重复

     	数字可以出现在任意位置*/
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) (i + 'a'));
            list.add((char) (i + 'A'));
        }
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        sb.append(r.nextInt(10));
        char[] arr = sb.toString().toCharArray();
        int i = r.nextInt(arr.length);
        char temp = arr[i];
        arr[i] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        String code = new String(arr);
        return code;

    }

    //找到用户
    public int findindex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }
}
