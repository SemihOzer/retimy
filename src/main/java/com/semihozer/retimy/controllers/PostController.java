package com.semihozer.retimy.controllers;

import com.semihozer.retimy.entities.Post;
import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.service.abstracts.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/getById/{id}")
    public Post getPostById(@PathVariable String id){
        return postService.getPostById(id);
    }

    @PostMapping("/save")
    public void savePost(@RequestBody Post post){
        postService.createPost(post);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deletePostById(@PathVariable String id){
        postService.deletePostById(id);
    }
}
