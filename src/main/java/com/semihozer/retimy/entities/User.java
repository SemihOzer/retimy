package com.semihozer.retimy.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Document
public class User {

    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String user_name;
    private String email;
    private String password;
    private Date birth_date;
    private Timestamp timestamp;
    private List<Post> posts;
    private List<Post> liked_posts;
    private List<Comment> comments;
    private List<User> followers;
    private List<User> followings;
    private List<User> known_users;

    public User() {
    }

    public User(String first_name, String last_name, String user_name, String email, String password, Date birth_date, List<Post> posts, List<Post> liked_posts, List<Comment> comments, List<User> followers, List<User> followings, List<User> known_users) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.birth_date = birth_date;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.posts = posts;
        this.liked_posts = liked_posts;
        this.comments = comments;
        this.followers = followers;
        this.followings = followings;
        this.known_users = known_users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getLiked_posts() {
        return liked_posts;
    }

    public void setLiked_posts(List<Post> liked_posts) {
        this.liked_posts = liked_posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }

    public List<User> getKnown_users() {
        return known_users;
    }

    public void setKnown_users(List<User> known_users) {
        this.known_users = known_users;
    }
}
