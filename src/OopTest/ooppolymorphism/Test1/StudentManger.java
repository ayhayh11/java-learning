package OopTest.ooppolymorphism.Test1;

public class StudentManger {
    public void register(Person person){
        System.out.println("姓名为"+person.getName()+"注册成功"+"zhanghao"+person.getUsername()+"密码"+person.getPassword());
        person.work();
    }
}
