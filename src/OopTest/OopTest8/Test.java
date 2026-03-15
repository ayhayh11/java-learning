package OopTest.OopTest8;

public class Test {
    public static void main(String[] args) {
//定义一个学生：
// 属性：姓名，年龄
// 行为：吃饭，睡觉，学习
        Student s1=new Student();
        s1.setName("小王");
        s1.setAge(18);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.eat();
        s1.sleep();
        s1.study();
        Student s2=new Student("zhangsan",20);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        s2.eat();
        s2.sleep();
        s2.study();

    }
}
