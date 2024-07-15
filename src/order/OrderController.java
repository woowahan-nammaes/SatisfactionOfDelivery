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
    private static final int OPTION_CONFIRM_ORDER = 1;
    private static final int OPTION_CANCEL_ORDER = 2;

    public void create(User user, Menu menu) {
        String menuName = menu.getName();
        Store store = storeService.getStoreById(menu.getStoreId());
        String storeName = store.getName();

        while (true) {
            orderView.printCheckOrder(menuName);
            int inputOption = orderView.getInputNumber();
            if (handleOrderOption(inputOption, user, menu, store, storeName, menuName)) {
                break;
            }
        }
    }

    private boolean handleOrderOption(int inputOption, User user, Menu menu, Store store, String storeName, String menuName) {
        return switch (inputOption) {
            case OPTION_CONFIRM_ORDER -> {
                createOrder(user, menu, store, storeName, menuName);
                yield true;
            }
            case OPTION_CANCEL_ORDER -> true;
            default -> {
                orderView.printErrorMessage();
                yield false;
            }
        };
    }

    private void createOrder(User user, Menu menu, Store store, String storeName, String menuName) {
        Order order = orderService.create(user, menu, store);
        orderView.printOrderCompleteMessage(storeName, menuName);
    }

    public void getUserOrders(User user) {
        List<Order> orders = orderService.getUserOrders(user.getId());
        orderView.printUserOrdersMessage(orders);
    }
}
