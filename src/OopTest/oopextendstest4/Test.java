package OopTest.oopextendstest4;

public class Test {
    public static void main(String[] args) {
     /*   某电商项目售卖智能设备，智能设备包括:手机，笔记本电脑，平板
        所有的智能设备有以下属性:商品名，
        1.商品价格行为:计算商品价格:
        [0~1000)元，不打折
        [1000~5000)元,9折
        [5000~10000)元,8折
        超出10000元，7折
        2手机享受额外补贴，在原有的基础上基础打9折。
        3，笔记本电脑和平板电脑没有不享受额外补贴。*/
        //1.创建手机对象
        Phone p = new Phone();
        p.name = "华为手机";
        p.price = 5000;
        System.out.println(p.name+" ,"+p.payment());
        //2.创建笔记本电脑对象
        Laptop l = new Laptop();
        l.name = "华硕笔记本电脑";
        l.price = 8000;
        System.out.println(l.name+" ,"+l.payment());
        //3.创建平板对象
        Pad pad = new Pad();
        pad.name = "华硕平板";
        pad.price = 3000;
        System.out.println(pad.name+" ,"+pad.payment());
    }
}
