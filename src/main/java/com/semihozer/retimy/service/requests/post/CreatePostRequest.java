package com.semihozer.retimy.service.requests.post;

import com.semihozer.retimy.entities.Comment;
import com.semihozer.retimy.entities.Photo;
import com.semihozer.retimy.entities.User;

import java.sql.Timestamp;
import java.util.List;

public class CreatePostRequest {

    private String id;
    private User user;
    private List<Comment> comments;
    private List<User> likes;
    private String title;
    private String text;
    private String photo_id;
    private Timestamp timestamp;

    public CreatePostRequest(String id, User user, List<Comment> comments, List<User> likes, String title, String text, String photo_id, Timestamp timestamp) {
        this.id = id;
        this.user = user;
        this.comments = comments;
        this.likes = likes;
        this.title = title;
        this.text = text;
        this.photo_id = photo_id;
        this.timestamp = timestamp;
    }

    public CreatePostRequest() {
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
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

    public String getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(String photo_id) {
        this.photo_id = photo_id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
