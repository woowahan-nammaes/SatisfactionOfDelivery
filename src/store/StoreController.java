package store;

import java.util.List;

public class StoreController {
    private  final StoreView storeView;
    private final StoreService storeService;

    public StoreController() {
        StoreDAO storeDAO = new StoreDAO();
        this.storeService = new StoreService(storeDAO);
        this.storeView = new StoreView();
    }

    public void createStore(String name, String address, Category category) {
        storeService.addStore(name, address, category);
    }
    public int selectCategory(){
        Category selectedCategory= storeView.selectCategory();
        if(selectedCategory != null) {
            List<Store> stores = getStores(selectedCategory.name());
            storeView.showStores(stores);
            //TODO: 메뉴를 선택할 수 있게 값 넘겨주기
        }
        //TODO:뒤로가기는 -1로 리턴
        return -1;
    }
    public Store getStore(Long id) {
        return storeService.getStoreById(id);
    }

    public List<Store> getStores(String category) {
        return storeService.getStoresByCategory(category);
    }

}
