package com.semihozer.retimy.controllers;

import com.semihozer.retimy.entities.Post;
import com.semihozer.retimy.service.abstracts.PostService;
import com.semihozer.retimy.service.requests.post.CreatePostRequest;
import com.semihozer.retimy.service.responses.post.GetPostByIdResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/getById/{id}")
    public GetPostByIdResponse getPostById(@PathVariable String id){
        return postService.getPostById(id);
    }

    @PostMapping("/save")
    public void savePost(@RequestBody CreatePostRequest createPostRequest){
        postService.createPost(createPostRequest);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deletePostById(@PathVariable String id){
        postService.deletePostById(id);
    }
}
