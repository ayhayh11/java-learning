package OopTest.OopTest7;

public class Test {
    public static void main(String[] args) {
        //利用构造方法创建对象
        //学生张三，18，男，170.5
        Student s1=new Student();
        System.out.println(s1.getName()+","+s1.getAge()+"岁,"+s1.getSex()+","+s1.getHeight());
        Student s2=new Student("张三",18,'男',170.5);
        System.out.println(s2.getName()+","+s2.getAge()+"岁,"+s2.getSex()+","+s2.getHeight());
    }
}
