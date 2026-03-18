package OopTest.oopextendstest6;

public class MasterStudent extends  Student{
    public MasterStudent() {
    }

    public MasterStudent(int age, String name, String grade) {
        super(age, name, grade);
    }

    @Override
    public void study() {
        System.out.println("研究生学位");
    }

    @Override
    public void sleep() {
        System.out.println("在豪华公寓睡觉");
    }
}
