package order;

import menu.Menu;
import store.Store;
import user.User;

import java.util.List;

public class OrderService {
    private OrderDAO orderDAO = new OrderDAO();

    public Order create(User user, Menu menu, Store store) {
        Order inputOrder = new Order(store, menu, user, OrderStatus.RECEIVE);
        Order order = orderDAO.create(inputOrder);

        return order;
    }

    public List<Order> getUserOrders(Long userId) {
        return orderDAO.getOrdersByUserId(userId);
    }
}
