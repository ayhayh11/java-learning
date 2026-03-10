package LoopLoop;

public class loopdemo3 {
    public static void main(String[] args) {
        /*        打印平行四边形
           ******
          ******
         ******
         */
      /*  for (int i = 1; i <= 3; i++) {
            for (int j = i;  j<= 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印梯形
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <=2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //打印菱形
       /* for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //下半部分
        for (int i = 3; i >= 1; i--) {
            for (int j = i; j <=3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //打印空心菱形
        //上半 部
        for (int i = 1; i <= 2; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            if(i==1||i==5){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
        //下半部
        for (int i = 2; i >= 1; i--) {
            for (int j = i; j <=2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
