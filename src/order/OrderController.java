package order;

import menu.Menu;
import menu.MenuService;
import store.Store;
import store.StoreService;
import user.User;

import java.util.List;

public class OrderController {
    private OrderService orderService = new OrderService();
    private MenuService menuService = new MenuService();
    private StoreService storeService = new StoreService();

    private OrderView orderView = new OrderView();

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

}
