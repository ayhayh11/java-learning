package OopTest.oopextendstest3;

public class ThirdGenerationPhone extends SecondGenerationPhone{
    @Override
    public void call() {
        System.out.println("视频通话");
    }
    public void playgame(){
        System.out.println("玩游戏");
    }
}
