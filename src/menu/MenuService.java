package menu;

import java.util.List;

public class MenuService {

    private static final MenuDAO menuDAO = MenuDAO.getMenuDAO();

    public List<Menu> getStoreMenus(Long storeId) {
        return menuDAO.getStoreMenus(storeId);
    }

    public Menu create(Long storeId, String name, Integer price){
        Menu menu = new Menu(storeId, name, price);
        return menuDAO.save(menu);
    }
}
