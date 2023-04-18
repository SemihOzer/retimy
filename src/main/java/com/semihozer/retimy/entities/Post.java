package com.semihozer.retimy.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Document
public class Post {
    @Id
    private String id;
    private User user;
    private List<Comment> comments;
    private List<User> likes;
    private String title;
    private String text;
    private String photo_id;
    private Date timestamp;

    public Post() {
    }

    public Post(User user, List<User> likes, String title, String text,String photo_id,List<Comment> comments) {
        this.user = user;
        this.likes = likes;
        this.title = title;
        this.text = text;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.photo_id = photo_id;
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(String photo_id) {
        this.photo_id = photo_id;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
