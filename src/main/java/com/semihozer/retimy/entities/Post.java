package com.semihozer.retimy.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.List;

@Document
public class Post {
    @Id
    private String id;
    private User user;
    private List<User> likes;
    private String title;
    private String text;
    private Photo photo;
    private Timestamp timestamp;

    public Post() {
    }

    public Post(User user, List<User> likes, String title, String text,Photo photo) {
        this.user = user;
        this.likes = likes;
        this.title = title;
        this.text = text;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
