package apistring.testdemo4;

public class Test3 {
    public static void main(String[] args) {
       /* 定义一个方法，把int 数组中的数据按照指定的格式拼接成一个字符串返回，
        调用该方法，并在控制台输出结果。
        例如:数组为 int[] arr = {1,2,3};
        执行方法后的输出结果为:[1，2，3]*/
        int[] arr = {1, 2, 3};
        String s = ArrarUtil.printArray(arr);
        System.out.println(s);
    }
}
