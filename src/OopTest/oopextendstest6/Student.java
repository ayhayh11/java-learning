package OopTest.oopextendstest6;

public class Student extends  Person{
    private String grade;

    public Student() {

    }

    public Student(int age, String name, String grade) {
        super(age, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void study(){
        System.out.println("学习");
    }
}
