package menu;

import java.util.*;

public class MenuDAO {

    private static long key = 0;
    Map<Long, Menu> menuDb = new HashMap<>();

    public Menu save(Menu menu) {
        menu.setId(key);
        menuDb.put(key, menu);
        key += 1;
        return menu;
    }

    public List<Menu> getStoreMenus(long storeId) {
        List<Menu> menusInStore = new ArrayList<>();

        for (long menuKey : menuDb.keySet()) {
            Menu menu = menuDb.get(menuKey);
            if (storeId == menu.getStoreId()) {
                menusInStore.add(menu);
            }
        }

        return menusInStore;
    }

}
