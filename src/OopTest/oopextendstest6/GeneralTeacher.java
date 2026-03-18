package OopTest.oopextendstest6;

public class GeneralTeacher extends Teacher{
    public GeneralTeacher() {
    }

    public GeneralTeacher(int age, String name, String subject) {
        super(age, name, subject);
    }

    @Override
    public void teach() {
        System.out.println("通识课老师");
    }
}
