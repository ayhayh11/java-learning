package OopTest.oopextendstest2;

public class Test {
    public static void main(String[] args) {
        /*现在有三个电子设备，请设计他们的继承结构安卓手机:
        属性:品牌，价格，
        行为:打电话，发短信，nfc功能
        苹果手机:
        属性:品牌，价格
        行为:打电话，发短信
        笔记本电脑:属性:品牌，价格
        行为:编程
        画图:从下往上
        写代码:从上往下*/
        Android a = new Android();
        a.brand = "华为";
        a.price = 3999;
        System.out.println(a.brand+" ,"+a.price);
        a.call();
        a.sendMessage();
        a.nfc();
        IOS i = new IOS();
        i.brand = "苹果";
        i.price = 9999;
        System.out.println(i.brand+" ,"+i.price);
        i.call();
        i.sendMessage();
        Laptop l = new Laptop();
        l.brand = "华硕";
        l.price = 5999;
        System.out.println(l.brand+" ,"+l.price);
        l.coding();

    }
}
