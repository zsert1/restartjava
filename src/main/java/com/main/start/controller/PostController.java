package com.main.start.controller;


import com.main.start.entity.Post;
import com.main.start.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private  final PostService postService;



    @GetMapping("/list")
    public List<Post> postList(){
        return postService.postList();
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post(UUID.randomUUID(),"title","content1","", LocalDateTime.now());
    }


}
