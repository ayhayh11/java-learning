package OopTest.oopextendstest5;

public class Test {
    public static void main(String[] args) {
       /* 根据下面的描述定义继承结构
        学生:
        属性:姓名、年龄、年级
        老师:
        属性:姓名、年龄、学科*/
        Student s = new Student(18,"小王","一年");
        System.out.println(s.name+" ,"+s.age+" ,"+s.grade);
    }
}
