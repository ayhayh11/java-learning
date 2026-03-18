package OopTest.oopextendstest6;

public class BechelorStudent extends  Student{
    public BechelorStudent(int age, String name, String grade) {
        super(age, name, grade);
    }

    @Override
    public void study() {
        System.out.println("本科内容");
    }
}
