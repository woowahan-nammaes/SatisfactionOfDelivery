package store;

import java.util.List;

public class StoreController {
    private  final StoreView storeView;
    private final StoreService storeService;

    public StoreController() {
        this.storeService = new StoreService();
        this.storeView = new StoreView();
    }

    public Long getStoreCategories(){
        Category selectedCategory= storeView.selectCategoryView();
        if(selectedCategory != null) {
            List<Store> stores = getStores(selectedCategory.name());
            return storeView.selectStoreView(stores);
        }
        return -1L;
    }

    public List<Store> getStores(String category) {
        return storeService.getStoresByCategory(category);
    }

}
