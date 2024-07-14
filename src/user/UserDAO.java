package user;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    private static final UserDAO userDAO = new UserDAO();
    private static final Map<Long, User> userDb = new HashMap<>();
    private static long id = 0L;

    public User save(User user){
        user.setId(++id);
        userDb.put(user.getId(), user);

        return user;
    }
    public User readByLoginId(String loginId){
        for (User user : userDb.values()){
            if(user.getLoginId().equals(loginId)) return user;
        }
        return null;
    }
    public User login(String loginId, String password){

        for (User user : userDb.values()) {
            if(user.getLoginId().equals(loginId) && user.getPassword().equals(password)) {
                user.setIsLogin(true);
                return user;
            }
        }
        return null;
    }
    public User logout(String loginId){
        User user = userDb.get(id);
        user.setIsLogin(false);
        userDb.put(id, user);
        return user;
    }
}