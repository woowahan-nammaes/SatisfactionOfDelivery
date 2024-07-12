package menu;

public class dummyMenu {

    private final MenuService menuService = new MenuService();

    public void init() {
        menuService.create(0L, "시그니처차돌짜장면", 10000);
        menuService.create(0L, "원조짜장면", 5000);
        menuService.create(0L, "차돌짬뽕", 11000);
        menuService.create(0L, "과일탕수육", 18000);

        menuService.create(1L, "커스텀마라탕", 6000);
        menuService.create(1L, "마라샹궈", 9000);
        menuService.create(1L, "꿔바로우小", 7000);
        menuService.create(1L, "꿔바로우中", 13000);
        menuService.create(1L, "꿔바로우大", 17000);

        menuService.create(2L, "페퍼로니피자", 26000);
        menuService.create(2L, "ㄷㄷ피자", 33000);
        menuService.create(2L, "하와이안피자", 15000);
        menuService.create(2L, "더블치즈피자", 44000);
        menuService.create(2L, "올리브폭탄피자", 35000);

        menuService.create(3L, "황금올리브치킨", 18000);
        menuService.create(3L, "양념치킨", 22000);
        menuService.create(3L, "후덜덜치킨", 42000);

    }
}
