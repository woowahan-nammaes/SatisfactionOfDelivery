package store;

import menu.MenuService;

public class StoreInit {
    private final StoreService storeService;
    public StoreInit() {
        storeService = new StoreService();

    }

    public void init(){
        // name, add , category
        storeService.create(   "홍콩반점", "서울 강남구 역삼동",Category.CHINESE_FOOD);
        storeService.create(   "라화쿵부", "서울 강남구 압구정동",Category.CHINESE_FOOD);
        storeService.create(   "도미노피자", "서울 강남구 압구정동",Category.PIZZA);
        storeService.create(   "교촌치킨", "서울 강남구 논현동",Category.CHICKEN);
    }
}
