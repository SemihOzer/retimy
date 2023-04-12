package com.semihozer.retimy.service.concretes;

import com.semihozer.retimy.entities.Post;
import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.exceptions.PostNotFoundException;
import com.semihozer.retimy.repsitories.PostRepository;
import com.semihozer.retimy.service.abstracts.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getPostsByUser(User user) {
        return null;
    }

    @Override
    public Post getPostById(String id) {
        Optional<Post> post = postRepository.findById(id);

        if(post.isEmpty()){
            throw new PostNotFoundException("postId:"+id+" not found!");
        }

        return post.get();
    }

    @Override
    public void createPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void deletePostById(String id) {
        postRepository.deleteById(id);
    }
}
