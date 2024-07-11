package order;

public enum OrderStatus {
    RECEIVE("접수"),
    CONFIRMED("확인"),
    DELIVERING("배달중"),
    DELIVERED("배달완료");

    private final String korean;

    OrderStatus(String korean) {
        this.korean = korean;
    }

    public String getDescription(){
        return korean;
    }
}
