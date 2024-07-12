package user;

public class UserService {
}
    public UserDAO userDao = new UserDAO();

    public User signUp(String loginId, String password, String name, String address, String phoneNumber){
        if (userDao.readByLoginId(loginId) != null) {
            System.out.println("동일한 id가 존재합니다.");
            return null;
        }

        User user = new User(loginId,password,name,address,phoneNumber,false);

        System.out.println("회원가입이 되었어요.");
        return userDao.save(user);
    }

