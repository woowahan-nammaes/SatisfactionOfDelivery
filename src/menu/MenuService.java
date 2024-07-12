package menu;

import java.util.List;

public class MenuService {

    private static final MenuDAO menuDAO = new MenuDAO();

    public List<Menu> getStoreMenus(long storeId) {
        return menuDAO.getStoreMenus(storeId);
    }
}
