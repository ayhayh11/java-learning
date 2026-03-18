package OopTest.ooppolymorphism.Test1;

public class Test {
    public static void main(String[] args) {
       /* 学生类:
        属性:姓名，账号，密码行为:work:学生的工作是学习
        老师类:
        属性:姓名，账号，密码
        行为:work:老师的工作是教书
        管理员:
        属性:姓名，账号，密码
        行为:work:管理员的工作是管理网站
        学生管理系统:
        行为:注册register
        要求:能注册所有的角色
        输出:姓名为张三的同学注册成功，账号zhangsan，密码123456*/
        Person person=new Student("小王",123,321);
        StudentManger sm=new StudentManger();
        sm.register(person);
    }
}
