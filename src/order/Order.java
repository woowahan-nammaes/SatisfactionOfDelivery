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

    public Order() {}

    public Order(Store store, Menu menu, User user, OrderStatus status) {
        this.store = store;
        this.menu = menu;
        this.user = user;
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Store getStore() {
        return store;
    }

    public Menu getMenu() {
        return menu;
    }

    public User getUser() {
        return user;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
