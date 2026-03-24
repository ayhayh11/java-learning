package apistring.arraylistdemo;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        /*需求:定义一个集合，添加一些学生对象
        学生类的属性为:id，姓名，年龄。
        要求:
        1.遍历集合，将所有学生的属性打印在控制台上，每个学生一行
        2.定义一个方法，根据id查找学生的信息。
        存在:返回索引
        不存在:返回-1*/
        ArrayList<Student> s = new ArrayList<>();
        Student s1 = new Student("张三",18,"01");
        Student s2 = new Student("李四",19,"02");
        Student s3 = new Student("王五",20,"03");
        s.add(s1);
        s.add(s2);
        s.add(s3);
        for (int i = 0; i < s.size(); i++) {
            Student student = s.get(i);
            System.out.println(student.getId()+"--"+student.getName()+"--"+student.getAge());
        }
        int findstudent = findstudent("02", s);
        System.out.println(findstudent);
    }
    public static int findstudent(String id, ArrayList<Student> s){
        for (int i = 0; i < s.size(); i++) {
           Student student = s.get(i);
           if (student.getId().equals(id)){
               return i;
           }
        }

        return -1;
    }
}
