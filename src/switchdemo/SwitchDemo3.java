package switchdemo;

import java.lang.reflect.Field;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*
        * switch特性
        * 1.箭头标签
        * 2.case后面可以有多个值
        * 3.switch可以有运行结果
        * 4.yield关键字：表示switch的运行结果
        * */
      /*  int num=10;
        String name =switch (num){
            case 1,2,3,4 ->  {
                yield "一";
            }
            case 5,6,7-> "lalabubu";
            default -> "lala";
            };
        System.out.println(name)*/;
        /*练习利用switch模拟计算器
         */
        int a=10;
        int b=20;
        String op="+";
        int result=switch(op){
            case "+"->a + b;
            case "-"->a - b;
            case "*"->a * b;
            case "/"->a / b;
            default->0;
        };
        System.out.println(result);
        }
    }

