package contrlloop;
import java.util.Scanner;

public class contrlloopdemo1 {
    public static void main(String[] args) {
       //让用户输入一个数字，不能为负数，否则一直重写；
        Scanner sc = new Scanner(System.in);
        int a;
        while(true){
            System.out.println("请输入一个数字：");
             a=sc.nextInt();
            if(a>=0){
                break;
            }
            System.out.println("请输入一个正数：");


        }
            

    }
}
