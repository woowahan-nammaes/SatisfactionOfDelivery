package user;

public class UserService {
    public UserDAO userDao = UserDAO.getUserDAO();

    public User signUp(String loginId, String password, String name, String address, String phoneNumber){
        if (userDao.readByLoginId(loginId) != null) {
            System.out.println("동일한 id가 존재합니다.");
            return null;
        }

        User user = new User(loginId,password,name,address,phoneNumber,false);

        System.out.println("회원가입이 되었어요.");
        return userDao.save(user);
    }


    public User signIn(String loginId, String password){
        User tmpUser = userDao.login(loginId, password);
        if(tmpUser!=null){

            return tmpUser;
        }

        return null;
    }


    public User signOut(String loginId){
        if(userDao.readByLoginId(loginId) == null){
            return null;
        }
        return userDao.logout(loginId);
    }
}