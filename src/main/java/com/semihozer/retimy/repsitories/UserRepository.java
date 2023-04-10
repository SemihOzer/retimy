package com.semihozer.retimy.repsitories;

import com.semihozer.retimy.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
