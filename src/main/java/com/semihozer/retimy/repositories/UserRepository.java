package com.semihozer.retimy.repositories;

import com.semihozer.retimy.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User getUserByUserName(String username);
}
