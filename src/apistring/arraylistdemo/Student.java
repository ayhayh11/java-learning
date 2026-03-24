package apistring.arraylistdemo;

public class Student {
    private String name;
    private String id;
    private int age;

    public Student() {
    }

    public Student(String name,int age, String id ) {
        this.name = name;
        this.id = id;
        this.age = age;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
