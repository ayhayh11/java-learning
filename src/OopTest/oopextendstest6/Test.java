package OopTest.oopextendstest6;

public class Test {
    public static void main(String[] args) {
        /*本科学生
        属性:姓名、年龄、年级行为:吃饭、睡觉、学习(攻读学士学位)
        专业课老师:
        属性:姓名、年龄、学科行为:吃饭、睡觉、教书(教专业课知识)I
        硕士研究生:
        属性:姓名、年龄、年级
        行为:吃饭、睡觉、学习(攻读硕士学位)
        通识课老师:
        属性:姓名、年龄
        行为:吃饭、睡觉、教书(教通识课知识)
        过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉*/

        BechelorStudent b = new BechelorStudent(20,"小王","一年");
        System.out.println(b.getName()+" ,"+b.getAge()+" ,"+b.getGrade());
        b.study();
        b.eat();
        b.sleep();

    }
}
