package menu;

import store.StoreService;

import java.util.List;

public class MenuController {

    private static final MenuService menuService = new MenuService();
    private static final MenuView menuView = new MenuView();
    private static final StoreService storeService = new StoreService();

    public Menu getStoreMenus(Long storeId){

        List<Menu> menus = menuService.getStoreMenus(storeId);

        String storeName = storeService.getStoreById(storeId).getName();

        return menuView.getMenu(menus, storeName);
        
    }
}
