package com.semihozer.retimy.service.abstracts;

import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.service.requests.user.CreateUserRequest;
import com.semihozer.retimy.service.requests.user.UpdateUserRequest;
import com.semihozer.retimy.service.responses.user.GetUserByIdAnonymResponse;
import com.semihozer.retimy.service.responses.user.GetUserByIdResponse;
import com.semihozer.retimy.service.responses.user.GetUserByUserNameResponse;
import org.springframework.data.mongodb.core.query.Update;

public interface UserService {
    GetUserByIdResponse getUserById(String id);
    GetUserByIdAnonymResponse getUserByIdAnonym(String id);
    GetUserByUserNameResponse getUserByUserName(String username);
    void createUser(CreateUserRequest createUserRequest);
    void deleteUserById(String id);
    void updateUser(UpdateUserRequest updateUserRequest);
}
