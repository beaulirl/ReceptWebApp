package dao;

import model.User;

/**
 * Created by Admin on 13.12.2016.
 */
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

    public boolean removeUser(User user) {
        currentSession().delete(user);
        return true;
    }
}
