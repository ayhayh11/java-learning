package OopTest.interfacetest2;

public  class BasketballTeacher extends Teacher{
    public BasketballTeacher() {
    }

    public BasketballTeacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }

}
