package com.semihozer.retimy.entities;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Photo {
    @Id
    private String id;
    private Binary image;

}
