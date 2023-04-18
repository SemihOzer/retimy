package com.semihozer.retimy.service.concretes;

import com.semihozer.retimy.entities.Post;
import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.service.requests.post.CreatePostRequest;
import com.semihozer.retimy.service.responses.post.GetPostByIdResponse;
import com.semihozer.retimy.service.responses.post.GetPostByUserResponse;
import com.semihozer.retimy.utilities.exceptions.PostNotFoundException;
import com.semihozer.retimy.repositories.PostRepository;
import com.semihozer.retimy.service.abstracts.PostService;
import com.semihozer.retimy.utilities.mappers.ModelMapperService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    PostRepository postRepository;
    ModelMapperService modelMapperService;

    public PostServiceImpl(PostRepository postRepository, ModelMapperService modelMapperService) {
        this.postRepository = postRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public List<GetPostByUserResponse> getPostsByUser(User user) {

    List<Post> posts = postRepository.findAllByUser(user);

    List<GetPostByUserResponse> postResponses = posts.stream()
            .map(post -> this.modelMapperService.forResponse().map(post,GetPostByUserResponse.class))
            .toList();

    return postResponses;
    }

    @Override
    public GetPostByIdResponse getPostById(String id) {
        Optional<Post> post = postRepository.findById(id);

        if(post.isEmpty()){
            throw new PostNotFoundException("postId:"+id+" not found!");
        }

        GetPostByIdResponse responseItem = this.modelMapperService.forResponse().map(post.get(),GetPostByIdResponse.class);

        return responseItem;
    }

    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = this.modelMapperService.forRequest().map(createPostRequest, Post.class);

        postRepository.save(post);
    }

    @Override
    public void deletePostById(String id) {
        postRepository.deleteById(id);
    }
}
