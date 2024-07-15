package user;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    private static final UserDAO userDAO = new UserDAO();
    private static final Map<Long, User> userDB = new HashMap<>();
    private static long idx = 0L;

    private UserDAO () {}

    public static UserDAO getUserDAO(){
        return userDAO;
    }

    public User save(User user){
        user.setId(++idx);
        userDB.put(user.getId(), user);
        return user;
    }
    public User readByLoginId(String loginId){
        for (User user : userDB.values()){
            if(user.getLoginId().equals(loginId)) return user;
        }
        return null;
    }
    public User login(String loginId, String password){
        for (User user : userDB.values()) {
            if(user.getLoginId().equals(loginId) && user.getPassword().equals(password)) {
                user.setIsLogin(true);
                return user;
            }
        }
        return null;
    }
    public User logout(String loginId){
        for(long id : userDB.keySet()){
            if(userDB.get(id).getLoginId().equals(loginId)){
                User user = userDB.get(id);
                user.setIsLogin(false);
                userDB.put(id, user);
                return user;
            }
        }
        return null;
    }
}