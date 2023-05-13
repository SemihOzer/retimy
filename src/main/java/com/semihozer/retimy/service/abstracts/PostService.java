package com.semihozer.retimy.service.abstracts;

import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.service.requests.post.CreatePostRequest;
import com.semihozer.retimy.service.responses.post.GetAllPostsResponse;
import com.semihozer.retimy.service.responses.post.GetPostByIdResponse;
import com.semihozer.retimy.service.responses.post.GetPostByUserResponse;

import java.util.List;

public interface PostService {
    List<GetPostByUserResponse> getPostsByUser(User user);
    GetPostByIdResponse getPostById(String id);
    void createPost(CreatePostRequest createPostRequest);
    void deletePostById(String id);

    List<GetAllPostsResponse> getAllPosts();

}
