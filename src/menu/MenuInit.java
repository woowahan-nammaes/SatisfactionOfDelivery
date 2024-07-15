package menu;

public class MenuInit {

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

        menuService.create(3L, "교촌오리지널", 18000);
        menuService.create(3L, "교촌허니콤보", 22000);
        menuService.create(3L, "후덜덜치킨", 42000);
        menuService.create(3L, "교촌레드콤보", 17000);
        menuService.create(3L, "교촌윙", 15000);
        menuService.create(3L, "교촌반반", 19000);

        menuService.create(4L, "황금올리브치킨", 17000);
        menuService.create(4L, "양념치킨", 18000);
        menuService.create(4L, "후라이드치킨", 16000);
        menuService.create(4L, "간장치킨", 17000);
        menuService.create(4L, "핫황금올리브", 19000);

        menuService.create(5L, "뿌링클", 18000);
        menuService.create(5L, "골드킹", 17000);
        menuService.create(5L, "맛초킹", 16000);
        menuService.create(5L, "해바라기후라이드", 15000);
        menuService.create(5L, "바삭클", 16000);

        menuService.create(6L, "스노윙치킨", 18000);
        menuService.create(6L, "핫블링", 17000);
        menuService.create(6L, "후라이드치킨", 16000);
        menuService.create(6L, "양념치킨", 17000);
        menuService.create(6L, "네네반반", 19000);

        menuService.create(7L, "치즈크러스트피자", 20000);
        menuService.create(7L, "베이컨포테이토피자", 18000);
        menuService.create(7L, "슈퍼슈프림피자", 19000);
        menuService.create(7L, "불고기피자", 18000);
        menuService.create(7L, "치킨바베큐피자", 20000);

        menuService.create(8L, "아메리칸피자", 18000);
        menuService.create(8L, "페퍼로니피자", 17000);
        menuService.create(8L, "치킨랜치피자", 19000);
        menuService.create(8L, "더블치즈피자", 18000);
        menuService.create(8L, "하와이안피자", 17000);

        menuService.create(9L, "슈퍼콤비네이션", 18000);
        menuService.create(9L, "불고기피자", 17000);
        menuService.create(9L, "포테이토피자", 16000);
        menuService.create(9L, "새우피자", 19000);
        menuService.create(9L, "치즈피자", 15000);

        menuService.create(10L, "전복죽", 12000);
        menuService.create(10L, "소고기죽", 11000);
        menuService.create(10L, "단호박죽", 10000);
        menuService.create(10L, "야채죽", 9000);
        menuService.create(10L, "참치죽", 11000);

        menuService.create(11L, "설렁탕", 10000);
        menuService.create(11L, "갈비탕", 12000);
        menuService.create(11L, "우거지탕", 11000);
        menuService.create(11L, "떡국", 9000);
        menuService.create(11L, "육개장", 11000);

        menuService.create(12L, "부추전", 15000);
        menuService.create(12L, "해물파전", 17000);
        menuService.create(12L, "떡볶이", 10000);
        menuService.create(12L, "오뎅탕", 12000);
        menuService.create(12L, "김치찌개", 11000);

        menuService.create(13L, "후라이드치킨", 16000);
        menuService.create(13L, "양념치킨", 17000);
        menuService.create(13L, "마늘치킨", 18000);
        menuService.create(13L, "간장치킨", 17000);
        menuService.create(13L, "크리스피치킨", 19000);

        menuService.create(14L, "연어초밥", 12000);
        menuService.create(14L, "참치초밥", 15000);
        menuService.create(14L, "광어초밥", 13000);
        menuService.create(14L, "새우초밥", 11000);
        menuService.create(14L, "장어초밥", 17000);

        menuService.create(15L, "모듬초밥", 18000);
        menuService.create(15L, "연어덮밥", 15000);
        menuService.create(15L, "우동", 8000);
        menuService.create(15L, "회덮밥", 16000);
        menuService.create(15L, "튀김덮밥", 14000);

        menuService.create(16L, "돈까스", 12000);
        menuService.create(16L, "카레라이스", 10000);
        menuService.create(16L, "냉모밀", 11000);
        menuService.create(16L, "장어덮밥", 17000);
        menuService.create(16L, "참치덮밥", 15000);

        menuService.create(17L, "모듬초밥", 18000);
        menuService.create(17L, "광어초밥", 15000);
        menuService.create(17L, "연어초밥", 16000);
        menuService.create(17L, "새우초밥", 14000);
        menuService.create(17L, "장어초밥", 17000);

        menuService.create(18L, "칼국수", 8000);
        menuService.create(18L, "콩국수", 9000);
        menuService.create(18L, "수제비", 7000);
        menuService.create(18L, "비빔국수", 8500);
        menuService.create(18L, "잔치국수", 7500);

        menuService.create(19L, "칼국수", 8500);
        menuService.create(19L, "비빔국수", 9000);
        menuService.create(19L, "수제비", 7500);
        menuService.create(19L, "콩국수", 9500);
        menuService.create(19L, "떡국", 8000);

        menuService.create(20L, "삼겹살", 15000);
        menuService.create(20L, "목살", 16000);
        menuService.create(20L, "갈매기살", 17000);
        menuService.create(20L, "항정살", 18000);
        menuService.create(20L, "대패삼겹살", 14000);

        menuService.create(21L, "소곱창", 20000);
        menuService.create(21L, "돼지곱창", 18000);
        menuService.create(21L, "막창", 17000);
        menuService.create(21L, "대창", 21000);
        menuService.create(21L, "곱창전골", 22000);

        menuService.create(22L, "김밥", 3000);
        menuService.create(22L, "라면", 4000);
        menuService.create(22L, "떡볶이", 5000);
        menuService.create(22L, "우동", 5000);
        menuService.create(22L, "오므라이스", 6000);

        menuService.create(23L, "떡볶이", 5000);
        menuService.create(23L, "순대", 5000);
        menuService.create(23L, "튀김", 4000);
        menuService.create(23L, "김말이", 3000);
        menuService.create(23L, "쫄면", 6000);

        menuService.create(24L, "떡볶이", 5000);
        menuService.create(24L, "라면", 4000);
        menuService.create(24L, "순대", 5000);
        menuService.create(24L, "김밥", 3000);
        menuService.create(24L, "오뎅", 2000);

        menuService.create(25L, "튀김모둠", 8000);
        menuService.create(25L, "오징어튀김", 5000);
        menuService.create(25L, "새우튀김", 6000);
        menuService.create(25L, "고구마튀김", 4000);
        menuService.create(25L, "김말이튀김", 4500);

        menuService.create(26L, "빅맥", 6000);
        menuService.create(26L, "상하이치킨버거", 5000);
        menuService.create(26L, "불고기버거", 4000);
        menuService.create(26L, "맥너겟", 3000);
        menuService.create(26L, "감자튀김", 2500);

        menuService.create(27L, "와퍼", 6500);
        menuService.create(27L, "불고기와퍼", 6000);
        menuService.create(27L, "치즈버거", 4500);
        menuService.create(27L, "치킨버거", 5000);
        menuService.create(27L, "프렌치프라이", 3000);

        menuService.create(28L, "징거버거", 5000);
        menuService.create(28L, "핫윙", 6000);
        menuService.create(28L, "타워버거", 5500);
        menuService.create(28L, "닭가슴살", 4000);
        menuService.create(28L, "코울슬로", 2500);

        menuService.create(29L, "불고기버거", 5000);
        menuService.create(29L, "새우버거", 4500);
        menuService.create(29L, "치킨버거", 4800);
        menuService.create(29L, "한우불고기버거", 6500);
        menuService.create(29L, "감자튀김", 2500);

        menuService.create(30L, "초콜릿케이크", 7000);
        menuService.create(30L, "치즈케이크", 6500);
        menuService.create(30L, "티라미수", 7500);
        menuService.create(30L, "쿠키", 3000);
        menuService.create(30L, "브라우니", 3500);

        menuService.create(31L, "크로와상", 3000);
        menuService.create(31L, "마카롱", 2500);
        menuService.create(31L, "치즈케이크", 6000);
        menuService.create(31L, "블루베리머핀", 4000);
        menuService.create(31L, "딸기쇼트케이크", 6500);

        menuService.create(32L, "오리지널도넛", 1500);
        menuService.create(32L, "초콜릿도넛", 2000);
        menuService.create(32L, "크림도넛", 2500);
        menuService.create(32L, "글레이즈드도넛", 1800);
        menuService.create(32L, "블루베리도넛", 2200);

        menuService.create(33L, "오리지널글레이즈드", 2000);
        menuService.create(33L, "초콜릿글레이즈드", 2200);
        menuService.create(33L, "슈가코팅도넛", 1800);
        menuService.create(33L, "커스터드필드", 2500);
        menuService.create(33L, "스트로베리필드", 2700);

    }
}
