package OopTest.OopTest7;

public class Student {
    //学生姓名，年龄，性别，身高，
    private String name;
    private int age;
    private char sex;
    private double height;
    public Student(){
        System.out.println("空参被调用");
    }
    public Student(String name,int age,char sex,double height){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.height=height;
    }
    public void setName( String name){
        this.name=name;
    }
    public String getName(){
         return name;
    }
    public void setAge(int age){
        if(age>=0&&age<=100){
            this.age=age;
        }
        else{
            System.out.println("请输入正确的年龄");
        }
    }
    public int getAge(){
        return age;
    }
    public void setSex(char sex){
        this.sex=sex;
    }
    public char getSex(){
        return sex;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
}
