package user;

public class User {
    private Long id;
    private String name;
    private String loginId;
    private String password;
    private String address;
    private String phoneNumber;
    private Boolean isLogin;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
    public Boolean getIsLogin() {
        return isLogin;
    }


    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }
}