package menu;

import store.StoreService;

import java.util.List;

public class MenuController {

    private static final MenuService menuService = new MenuService();
    private static final MenuView menuView = new MenuView();
    private static final StoreService storeService = new StoreService();

    public void getStoreMenus(long storeId){

        List<Menu> menus = menuService.getStoreMenus(storeId);

        String storeName = storeService.getStoreById(storeId).getName();
        menuView.getMenu(menus, storeName);

    }
}
