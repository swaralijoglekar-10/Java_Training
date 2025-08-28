package lecture21to30;

enum OrderStatus{PENDING, SHIPPED, DELIVERED}

class Order{
    private int orderId;
    private OrderStatus status;

    public Order(int orderId){
        this.orderId = orderId;
        this.status = OrderStatus.PENDING; // by default pending
    }

    public void updateStatus(OrderStatus newStatus){
        this.status = newStatus;
    }
}

public class EnumExample {
    public static void main(String[] args) {

        Order order = new Order(101);
        order.updateStatus(OrderStatus.SHIPPED);
        order.updateStatus(OrderStatus.DELIVERED);

    }
}
