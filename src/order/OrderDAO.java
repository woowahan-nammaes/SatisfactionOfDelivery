package order;

import java.time.LocalDateTime;
import java.util.*;

public class OrderDAO {

    private static final OrderDAO orderDAO = new OrderDAO();
    private static final Map<Long, Order> orderDb = new HashMap<>();
    private Long idx = 0L;

    private OrderDAO() {}

    public static OrderDAO getOrderDAO() {
        return orderDAO;
    }

    public Order create(Order order) {
        idx++;
        order.setId(idx);
        order.setCreatedAt(LocalDateTime.now());
        orderDb.put(idx, order);

        return order;
    }

    public List<Order> getOrdersByUserId(Long userId) {
        List<Order> orders = new ArrayList<>();
        for (Order order : orderDb.values()) {
            if (Objects.equals(order.getUser().getId(), userId)) {
                orders.add(order);
            }
        }
        return orders;
    }
}
