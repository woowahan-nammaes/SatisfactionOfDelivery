package user;

public class UserDAO {
}
    private static Map<Long, User> userdb = new HashMap<>();
    private static long id = 0L;

    public User save(User user){
        user.setId(++id);
        userdb.put(user.getId(), user);

        return user;
    }
    public User login(String loginId, String password){

        for (User user : userdb.values()) {
            if(user.getLoginId().equals(loginId) && user.getPassword().equals(password)) {
                user.setIsLogin(true);
                return user;
            }
        }
        return null;
    }
    public User logout(String loginId){
        User user = userdb.get(id);
        user.setIsLogin(false);
        userdb.put(id, user);
        return user;
    }
}