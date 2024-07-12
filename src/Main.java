
import store.*;

;import java.util.List;

public class Main {
    public static void main(String[] args) {
        StoreDAO storeDAO = new StoreDAO();
        StoreService storeService = new StoreService(storeDAO);
        StoreController storeController = new StoreController(storeService);
        StoreInit storeInit = new StoreInit(storeController);
        StoreView storeView = new StoreView();

        storeInit.init();
        Category selectedCategory = storeView.selectCategory();

        if(selectedCategory != null) {
            List<Store> stores = storeController.getStoresByCategory(selectedCategory.name());
            storeView.showStores(stores);
        }
    }
}
