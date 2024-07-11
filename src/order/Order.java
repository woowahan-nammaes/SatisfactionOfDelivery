package order;

import menu.Menu;
import store.Store;
import user.User;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private Store store;
    private Menu menu;
    private User user;
    private OrderStatus status;
    private LocalDateTime createdAt;


}
