package com.main.start.controller;


import com.main.start.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/list")
    public List<Post> postList(){
        return List.of(
                new Post(UUID.randomUUID(),"title2","content2","ㄴ", LocalDateTime.now()),
                new Post(UUID.randomUUID(),"title","content1"," ㄴ", LocalDateTime.now()),
                new Post(UUID.randomUUID(),"title3","content3","ㄴ ", LocalDateTime.now())
        );
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post(UUID.randomUUID(),"title","content1","", LocalDateTime.now());
    }


}
