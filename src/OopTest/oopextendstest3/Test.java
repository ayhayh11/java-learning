package OopTest.oopextendstest3;

public class Test {
    public static void main(String[] args) {
     /* 第一代手机:
        功能:打电话
        第二代手机:
        功能:打电话，发短信
        第三代手机:
        功能:打电话升级为视频通话，发短信，玩游戏*/
        FirstGenerationPhone f1 = new FirstGenerationPhone();
        f1.call();
        SecondGenerationPhone s1 = new SecondGenerationPhone();
        s1.call();
        s1.sendMessage();
        System.out.println("--------------------------------------------------");
        ThirdGenerationPhone t1 = new ThirdGenerationPhone();
        t1.call();
        t1.sendMessage();
        t1.playgame();
    }
}
