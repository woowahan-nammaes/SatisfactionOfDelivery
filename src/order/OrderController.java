package order;

import menu.Menu;
import store.Store;
import store.StoreService;
import user.User;

import java.util.List;

public class OrderController {
    private final OrderService orderService = new OrderService();
    private final StoreService storeService = new StoreService();
    private final OrderView orderView = new OrderView();

    public void create(User user, Menu menu) {
        String menuName = menu.getName();
        Store store = storeService.getStoreById(menu.getStoreId());
        String storeName = store.getName();
        int inputOption = 0;
        while (true) {
            orderView.printCheckOrder(menuName);
            inputOption = orderView.getInputNumber();
            if (inputOption == 1) {
                Order order = orderService.create(user, menu, store);
                orderView.printOrderCompleteMessage(storeName, menuName);
                break;
            } else if (inputOption == 2) {
                break;
            } else {
                orderView.printErrorMessage();
            }
        }
    }

    public void getUserOrders(User user) {
        List<Order> orders = orderService.getUserOrders(user.getId());
        orderView.printUserOrdersMessage(orders);
    }

}
