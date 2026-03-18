package OopTest.enumtest;

public class EnumTest1 {
    public static void main(String[] args) {
      /*  电商项目中，订单的状态只有以下6种，请编写代码实现。
        待支付 PAYMENT_PENDING
        处理中 PROCESSING
        己发货 SHIPPED
        配送中 OUT_FOR_DELIVERY
        已送达 DELIVERED
        已取消 CANCELLED
        */
        OrderState o1=OrderState.PAYMENT_PENDING;
        System.out.println(o1.getName());
        switch (o1){
            case PAYMENT_PENDING-> System.out.println("待支付");
            case PROCESSING-> System.out.println("处理中");
            case SHIPPED-> System.out.println("已发货");
            case OUT_FOR_DELIVERY-> System.out.println("配送中");
            case DELIVERED-> System.out.println("已送达");
            case CANCELLED-> System.out.println("已取消");
            default -> System.out.println("无效状态");
        }


    }
}
