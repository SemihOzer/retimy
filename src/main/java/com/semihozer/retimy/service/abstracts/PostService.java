package com.semihozer.retimy.service.abstracts;

import com.semihozer.retimy.entities.Post;
import com.semihozer.retimy.entities.User;

import java.util.List;

public interface PostService {
    List<Post> getPostsByUser(User user);
    Post getPostById(String id);
    void createPost(Post post);
    void deletePostById(String id);

}
