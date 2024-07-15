package store;

import java.util.List;

public class StoreController {
    private  final StoreView storeView;
    private final StoreService storeService;

    public StoreController() {
        this.storeService = new StoreService();
        this.storeView = new StoreView();
    }

    public long getStoreCategories(){
        Category selectedCategory= storeView.selectCategoryView();
        if(selectedCategory != null) {
            List<Store> stores = getStores(selectedCategory.name());
            long storeId = storeView.selectStoreView(stores);
            return storeId;
        }
        //뒤로가기는 -1을 리턴
        return -1L;
    }

    public List<Store> getStores(String category) {
        return storeService.getStoresByCategory(category);
    }

}
