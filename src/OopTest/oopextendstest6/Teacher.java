package OopTest.oopextendstest6;

public class Teacher extends  Person{
   private String subject;

    public Teacher() {

    }

    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teach(){
        System.out.println("上课~");
    }
}
