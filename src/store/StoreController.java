package store;

import java.util.List;

public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    public void createStore(String name, String address, Category category) {
        storeService.addStore(name, address, category);
    }

    public Store getStoreById(Long id) {
        return storeService.getStoreById(id);
    }

    public List<Store> getStoresByCategory(String category) {
        return storeService.getStoresByCategory(category);
    }

    public void updateStore(Long id,Store store) {
        storeService.updateStore(store);
    }

    // 스토어 삭제
    public void deleteStore(Long id) {
        storeService.deleteStore(id);
    }
}
