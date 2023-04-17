package com.semihozer.retimy.service.concretes;

import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.service.requests.user.CreateUserRequest;
import com.semihozer.retimy.service.requests.user.UpdateUserRequest;
import com.semihozer.retimy.service.responses.user.GetUserByIdAnonymResponse;
import com.semihozer.retimy.service.responses.user.GetUserByIdResponse;
import com.semihozer.retimy.service.responses.user.GetUserByUserNameResponse;
import com.semihozer.retimy.utilities.exceptions.UserNotFoundException;
import com.semihozer.retimy.repositories.UserRepository;
import com.semihozer.retimy.service.abstracts.UserService;
import com.semihozer.retimy.utilities.mappers.ModelMapperService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    ModelMapperService modelMapperService;

    public UserServiceImpl(UserRepository userRepository,ModelMapperService modelMapperService) {
        this.userRepository = userRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public GetUserByIdResponse getUserById(String id) {
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()){
            throw new UserNotFoundException("userId:"+id+ " not found!");
        }

        GetUserByIdResponse responseItem = this.modelMapperService.forResponse().map(user.get(),GetUserByIdResponse.class);

        return responseItem;

    }

    @Override
    public GetUserByIdAnonymResponse getUserByIdAnonym(String id) {
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()){
            throw new UserNotFoundException("userId:"+id+ " not found!");
        }

        GetUserByIdAnonymResponse responseItem = this.modelMapperService.forResponse().map(user.get(),GetUserByIdAnonymResponse.class);

        return responseItem;
    }

    @Override
    public GetUserByUserNameResponse getUserByUserName(String username) {
        User user = userRepository.getUserByUserName(username);

        GetUserByUserNameResponse responseItem = this.modelMapperService.forResponse().map(user, GetUserByUserNameResponse.class);

        return responseItem;

    }

    @Override
    public void createUser(CreateUserRequest createUserRequest) {

        User user = this.modelMapperService.forRequest().map(createUserRequest,User.class);

        userRepository.save(user);

    }


    @Override
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(UpdateUserRequest updateUserRequest) {
        User user = this.modelMapperService.forRequest().map(updateUserRequest, User.class);

        userRepository.save(user);
    }


}
