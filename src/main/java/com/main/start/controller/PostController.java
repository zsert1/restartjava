package com.main.start.controller;


import com.main.start.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/list")
    public List<Post> postList(){
        return List.of(
                new Post("2","title2","content2","ㄴ", LocalDateTime.now()),
                new Post("1","title","content1"," ㄴ", LocalDateTime.now()),
                new Post("3","title3","content3","ㄴ ", LocalDateTime.now())
        );
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post("1","title","content1","", LocalDateTime.now());
    }


}
