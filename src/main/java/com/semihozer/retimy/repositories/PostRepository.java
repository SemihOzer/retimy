package com.semihozer.retimy.repositories;

import com.semihozer.retimy.entities.Post;
import com.semihozer.retimy.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post,String> {
    List<Post> findAllByUser(User user);
}
