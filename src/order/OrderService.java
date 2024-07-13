package order;

public class OrderService {

    public List<Order> getUserOrders(Long userId) {
        return orderDAO.getOrdersByUserId(userId);
    }
}
