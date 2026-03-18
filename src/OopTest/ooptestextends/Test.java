package OopTest.ooptestextends;

public class Test {
    public static void main(String[] args) {
        //用Javabean创建对象，学生和老师都有，姓名，年龄和行为吃饭，学生单独有年级和学习
        //老师单独有学科和上课
        Student s=new Student();
        s.name="小王";
        s.age=18;
        s.grade="一年";
        System.out.println(s.name+" ,"+s.age+" ,"+s.grade);

        s.study();
        s.eat();
        System.out.println("------------------------------------------------");
       Teacher t=new Teacher();
       t.name="小zhang";
       t.age=20;
       t.subject="语文";
       System.out.println(t.name+" ,"+t.age+" ,"+t.subject);
       t.eat();
       t.teach();
    }
}
