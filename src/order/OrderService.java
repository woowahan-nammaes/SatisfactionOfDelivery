package order;

import menu.Menu;
import store.Store;
import user.User;

import java.util.List;

public class OrderService {

    private final OrderDAO orderDAO = OrderDAO.getOrderDAO();

    public Order create(User user, Menu menu, Store store) {
        Order inputOrder = new Order(store, menu, user, OrderStatus.RECEIVE);

        return orderDAO.create(inputOrder);
    }

    public List<Order> getUserOrders(Long userId) {
        return orderDAO.getOrdersByUserId(userId);
    }
}
