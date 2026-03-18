package OopTest.oopextendstest6;

public class MajorTeacher extends  Teacher{
    public MajorTeacher() {
    }

    public MajorTeacher(int age, String name, String subject) {
        super(age, name, subject);
    }

    @Override
    public void teach() {
        System.out.println("专业课知识");
    }
}
