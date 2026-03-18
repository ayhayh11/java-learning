package OopTest.oopextendshomework.HomeWork1;

public class Test {
    public static void main(String[] args) {
      /*  1.经理
        成员变量:工号，姓名，工资，管理奖金成员方法:工作(管理其他人)，吃饭(吃米饭)
        2.厨师
        成员变量:工号，姓名，工资
        成员方法:工作(炒菜)，吃饭(吃米饭) */
        Cook c =new Cook("小王",01,5000);
        System.out.println(c.getName()+" ,"+c.getNumber()+" ,"+c.getSalary());
        c.work();
        c.eat();

    }
}
