package com.semihozer.retimy.service.concretes;

import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.exceptions.UserNotFoundException;
import com.semihozer.retimy.repsitories.UserRepository;
import com.semihozer.retimy.service.abstracts.UserService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(String id) {
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()){
            throw new UserNotFoundException("userId:"+id+ " not found!");
        }

        return user.get();

    }

    @Override
    public User getUserByUserName(String username) {
        User user = userRepository.getUserByUserName(username);

        return user;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUserById(User user) {

    }
}
