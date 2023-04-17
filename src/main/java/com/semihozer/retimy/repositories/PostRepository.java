package com.semihozer.retimy.repositories;

import com.semihozer.retimy.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
