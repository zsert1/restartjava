package com.main.start.service;

import com.main.start.entity.Post;
import com.main.start.mapper.PostMapper;
import com.main.start.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {

    private  final PostRepository postRepository;
    private  final PostMapper postMapper;

//    public List<Post> postList() {
//        return postRepository.findAll();
//    }
 public List<Post> postList(){
        return  postMapper.listPost();
 }
}
