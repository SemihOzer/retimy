package com.semihozer.retimy.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.List;

@Document
public class Comment {
    @Id
    private String id;
    private Timestamp timestamp;
    private User user;
    private String text;
    private List<User> likes;

    public Comment() {
    }

    public Comment(User user, String text, List<User> likes) {
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.user = user;
        this.text = text;
        this.likes = likes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }
}
