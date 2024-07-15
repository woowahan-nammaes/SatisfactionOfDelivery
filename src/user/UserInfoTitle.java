package user;

public enum UserInfoTitle {
    LOGINID("아이디"),
    PASSWORD("비밀번호"),
    NAME("닉네임"),
    ADDRESS("주소"),
    PHONENUMBER("전화번호");

    private final String fieldName;

    UserInfoTitle(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
