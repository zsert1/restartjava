package com.main.start.service;

import com.main.start.entity.Post;
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

    public List<Post> postList() {
        return postRepository.findAll();
    }
}
