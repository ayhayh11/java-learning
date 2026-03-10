package contrlloop;

import java.util.Scanner;

public class breakdemo1 {
    public static void main(String[] args) {
        //敲7游戏，遇到含有7或者7的倍数就输出过
        for(int i=1;i<100;i++){
            if(i%7==0||i%10==7||i/10%10==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

        }
    }




