package menu;

import java.util.*;

public class MenuDAO {

    private static final MenuDAO menuDAO = new MenuDAO();
    private static final Map<Long, Menu> menuDB = new HashMap<>();
    private static long idx = 0;

    private MenuDAO() {}

    public static MenuDAO getMenuDAO() {
        return menuDAO;
    }

    public Menu save(Menu menu) {
        menu.setId(idx);
        menuDB.put(idx, menu);
        idx += 1;
        return menu;
    }

    public List<Menu> getStoreMenus(long storeId) {
        List<Menu> menusInStore = new ArrayList<>();

        for (long menuKey : menuDB.keySet()) {
            Menu menu = menuDB.get(menuKey);
            if (storeId == menu.getStoreId()) {
                menusInStore.add(menu);
            }
        }

        return menusInStore;
    }

}
