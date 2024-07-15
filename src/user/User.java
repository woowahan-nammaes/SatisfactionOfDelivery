package user;

public class User {
    private Long id;
    private String loginId;
    private String password;
    private String name;
    private String address;
    private String phoneNumber;
    private Boolean isLogin;

    public User() {}

    public User(String loginId, String password, String name, String address, String phoneNumber, Boolean isLogin) {
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isLogin = isLogin;
    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }
}