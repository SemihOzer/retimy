package com.semihozer.retimy.service.responses.user;

import com.semihozer.retimy.entities.Comment;
import com.semihozer.retimy.entities.Post;
import com.semihozer.retimy.entities.User;

import java.util.List;

public class GetUserByIdAnonymResponse {
    private String id;
    private String userName;
    private List<Post> posts;
    private List<Post> liked_posts;
    private List<Comment> comments;
    private List<User> followers;
    private List<User> followings;
    private List<User> known_users;

    public GetUserByIdAnonymResponse(String id, String userName, List<Post> posts, List<Post> liked_posts, List<Comment> comments, List<User> followers, List<User> followings, List<User> known_users) {
        this.id = id;
        this.userName = userName;
        this.posts = posts;
        this.liked_posts = liked_posts;
        this.comments = comments;
        this.followers = followers;
        this.followings = followings;
        this.known_users = known_users;
    }

    public GetUserByIdAnonymResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
