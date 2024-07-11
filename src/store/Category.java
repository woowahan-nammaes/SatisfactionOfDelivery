package store;

public enum Category {
    KOREAN_FOOD("한식"),
    JAPANESE_FOOD("일식"),
    CHINESE_FOOD("중식"),
    WESTERN_FOOD("양식"),
    STREET_FOOD("분식"),
    FAST_FOOD("패스트푸드"),
    CHICKEN("치킨"),
    PIZZA("피자"),
    DESSERT("디저트");

    private final String korean;

    Category(String korean) {
        this.korean = korean;
    }

    public String getDescription(){
        return korean;
    }
}
