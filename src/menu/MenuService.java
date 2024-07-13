package menu;

import java.util.List;

public class MenuService {

    private static final MenuDAO menuDAO = new MenuDAO();

    public List<Menu> getStoreMenus(long storeId) {
        return menuDAO.getStoreMenus(storeId);
    }

    public Menu create(long storeId, String name, int price){
        Menu menu = new Menu(storeId, name, price);
        return menuDAO.save(menu);
    }
}
