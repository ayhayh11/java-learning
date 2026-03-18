package OopTest.enumtest;

public enum OrderState {
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("己发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");
    private String name;
    private OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
