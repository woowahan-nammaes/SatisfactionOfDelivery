package order;

import java.time.LocalDateTime;
import java.util.*;

public class OrderDAO {
    Map<Long, Order> orderDb = new HashMap<Long, Order>();
    private Long idx = 0L;

    public Order create(Order order) {
        idx++;
        order.setId(idx);
        order.setCreatedAt(LocalDateTime.now());
        orderDb.put(idx, order);

        return order;
    }

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
