package com.semihozer.retimy.controllers;

import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.service.abstracts.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @GetMapping("/getByUserName/{username}")
    public User getUserByUserName(@PathVariable String username){
        return userService.getUserByUserName(username);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteUserById(@PathVariable String id){
        userService.deleteUserById(id);
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User user){
        userService.createUser(user);
    }
}
