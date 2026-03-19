package OopTest.interfacetest2;

public class PpTeacher extends Teacher implements Say{
    @Override
    public void say() {
        System.out.println("说英语");
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");

    }
}
