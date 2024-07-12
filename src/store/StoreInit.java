package store;

public class StoreInit {
    private final StoreController storeController;

    public StoreInit(StoreController storeController) {
        this.storeController = storeController;
    }

    public void init(){
        // name, add , category
        storeController.createStore(   "홍콩반점", "서울 강남구 역삼동",Category.CHINESE_FOOD);
        storeController.createStore(   "라화쿵부", "서울 강남구 압구정동",Category.CHINESE_FOOD);
        storeController.createStore(   "도미노피자", "서울 강남구 압구정동",Category.PIZZA);
        storeController.createStore(   "교촌치킨", "서울 강남구 논현동",Category.CHICKEN);
    }
}
