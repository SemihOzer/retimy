package com.semihozer.retimy.service.abstracts;

import com.semihozer.retimy.entities.User;

public interface UserService {
    User getUserById(String id);
    User getUserByUserName(String username);
    void createUser(User user);
    void deleteUserById(String id);
    void updateUserById(User user);
}
