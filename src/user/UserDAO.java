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
