package LoopLoop;

public class loopdemo1 {
    public static void main(String[] args) {
        /*打印一个四行五列的星号
                *****
                *****
                *****
                ******/
    /*    System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();*/
        //把sout换成循环五次代表五列
        //把上面的循环四次代表四行
        ;for(int i=1; i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
