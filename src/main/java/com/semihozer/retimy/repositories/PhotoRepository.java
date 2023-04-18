package com.semihozer.retimy.repositories;

import com.semihozer.retimy.entities.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo,String> {

}
