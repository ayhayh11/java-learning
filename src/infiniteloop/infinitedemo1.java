package infiniteloop;

public class infinitedemo1 {
    public static void main(String[] args) {
        // 无限循环
        //无限循环下不能写其他代码；否则会报错
        //for格式
     /*   for(;;){
            System.out.println("我是大好人");
        }*/
        //while格式
       /* while (true){
            System.out.println("我是大好人");
        }*/
        //do while
        do {
            System.out.println("我是大好人");
        } while (true);
        //示例：System.out.println("程序结束");
    }
}
