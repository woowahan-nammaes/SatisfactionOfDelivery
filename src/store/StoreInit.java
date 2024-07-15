package store;

import menu.MenuService;

public class StoreInit {
    private final StoreService storeService;
    public StoreInit() {
        storeService = new StoreService();
    }

    public void init(){
        // name, add , category
        storeService.create("홍콩반점", "서울 강남구 역삼동",Category.CHINESE_FOOD);
        storeService.create("라화쿵부", "서울 강남구 압구정동",Category.CHINESE_FOOD);
        storeService.create("도미노피자", "서울 강남구 압구정동",Category.PIZZA);

        storeService.create("교촌치킨", "서울 강남구 논현동",Category.CHICKEN);
        storeService.create("BBQ치킨", "서울 강남구 압구정동", Category.CHICKEN);
        storeService.create("bhc치킨", "서울 강남구 역삼동", Category.CHICKEN);
        storeService.create("네네치킨", "서울 강남구 신사동", Category.CHICKEN);

        storeService.create("피자헛", "서울 강남구 역삼동", Category.PIZZA);
        storeService.create("파파존스", "서울 강남구 신사동", Category.PIZZA);
        storeService.create("미스터피자", "서울 강남구 논현동", Category.PIZZA);

        storeService.create("본죽", "서울 강남구 역삼동", Category.KOREAN_FOOD);
        storeService.create("신선설농탕", "서울 강남구 압구정동", Category.KOREAN_FOOD);
        storeService.create("한신포차", "서울 강남구 신사동", Category.KOREAN_FOOD);
        storeService.create("장모님치킨", "서울 강남구 논현동", Category.KOREAN_FOOD);

        storeService.create("스시로", "서울 강남구 역삼동", Category.JAPANESE_FOOD);
        storeService.create("스시호", "서울 강남구 압구정동", Category.JAPANESE_FOOD);
        storeService.create("일식당", "서울 강남구 신사동", Category.JAPANESE_FOOD);
        storeService.create("초밥집", "서울 강남구 논현동", Category.JAPANESE_FOOD);

        storeService.create("홍대칼국수", "서울 강남구 역삼동", Category.WESTERN_FOOD);
        storeService.create("신사동칼국수", "서울 강남구 압구정동", Category.WESTERN_FOOD);
        storeService.create("삼겹살집", "서울 강남구 신사동", Category.WESTERN_FOOD);
        storeService.create("곱창집", "서울 강남구 논현동", Category.WESTERN_FOOD);

        storeService.create("김밥천국", "서울 강남구 역삼동", Category.STREET_FOOD);
        storeService.create("떡볶이집", "서울 강남구 압구정동", Category.STREET_FOOD);
        storeService.create("분식집", "서울 강남구 신사동", Category.STREET_FOOD);
        storeService.create("튀김집", "서울 강남구 논현동", Category.STREET_FOOD);

        storeService.create("맥도날드", "서울 강남구 역삼동", Category.FAST_FOOD);
        storeService.create("버거킹", "서울 강남구 압구정동", Category.FAST_FOOD);
        storeService.create("KFC", "서울 강남구 성수동", Category.FAST_FOOD);
        storeService.create("롯데리아", "서울 강남구 논현동", Category.FAST_FOOD);

        storeService.create("빕스", "서울 강남구 역삼동", Category.DESSERT);
        storeService.create("파리바게트", "서울 강남구 압구정동", Category.DESSERT);
        storeService.create("던킨도너츠", "서울 강남구 신사동", Category.DESSERT);
        storeService.create("크리스피크림", "서울 강남구 성수동", Category.DESSERT);
    }
}
