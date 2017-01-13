package dao;

import model.User;

/**
 * Created by Admin on 13.12.2016.
 */
public interface UserDao extends GenericDao<User, Integer> {
    boolean removeUser(User user);
}
