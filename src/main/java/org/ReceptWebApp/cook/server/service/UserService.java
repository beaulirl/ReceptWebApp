package service;

import model.User;

/**
 * Created by Admin on 14.12.2016.
 */
public interface UserService extends GenericService<User, Integer> {
    boolean removeUser(User user);
}

