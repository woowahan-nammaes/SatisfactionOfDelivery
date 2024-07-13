package store;

import java.util.List;

public class StoreService {
    private final StoreDAO storeDAO;

    public StoreService() {
        storeDAO = new StoreDAO();
    }

    public void create( String name, String address, Category category) {
        Store store = new Store(name,address,category);
        storeDAO.save(store);
    }

    public Store getStoreById(Long id) {
        return storeDAO.findById(id);
    }

    public List<Store> getStoresByCategory(String category) {
        return storeDAO.findByCategory(category);
    }
}
