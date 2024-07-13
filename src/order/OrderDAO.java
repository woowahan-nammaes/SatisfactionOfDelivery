package order;

public class OrderDAO {
    public List<Order> getOrdersByUserId(Long userId) {
        List<Order> orders = new ArrayList<Order>();
        for (Order order : orderDb.values()) {
            if (Objects.equals(order.getUser().getId(), userId)) {
                orders.add(order);
            }
        }
        return orders;
    }
}
