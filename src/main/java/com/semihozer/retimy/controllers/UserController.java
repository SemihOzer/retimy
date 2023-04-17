package com.semihozer.retimy.controllers;

import com.semihozer.retimy.service.abstracts.UserService;
import com.semihozer.retimy.service.requests.user.CreateUserRequest;
import com.semihozer.retimy.service.requests.user.UpdateUserRequest;
import com.semihozer.retimy.service.responses.user.GetUserByIdAnonymResponse;
import com.semihozer.retimy.service.responses.user.GetUserByIdResponse;
import com.semihozer.retimy.service.responses.user.GetUserByUserNameResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getById/{id}")
    public GetUserByIdResponse getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @GetMapping("/getByIdAnonym/{id}")
    public GetUserByIdAnonymResponse getUserAnonymById(@PathVariable String id){
        return userService.getUserByIdAnonym(id);
    }

    @GetMapping("/getByUserName/{username}")
    public GetUserByUserNameResponse getUserByUserName(@PathVariable String username){
        return userService.getUserByUserName(username);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteUserById(@PathVariable String id){
        userService.deleteUserById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveUser(@RequestBody CreateUserRequest createUserRequest){
        userService.createUser(createUserRequest);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody UpdateUserRequest updateUserRequest){
        userService.updateUser(updateUserRequest);
    }
}
