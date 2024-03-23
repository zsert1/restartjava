package com.main.start;

import com.main.start.entity.Post;
import com.main.start.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class StartApplication implements CommandLineRunner {

    private  final PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Post> postList= List.of(
                new Post(UUID.randomUUID(),"title2","content2","ㄴ", LocalDateTime.now()),
                new Post(UUID.randomUUID(),"title","content1"," ㄴ", LocalDateTime.now()),
                new Post(UUID.randomUUID(),"title3","content3","ㄴ ", LocalDateTime.now())
        );
        postRepository.saveAll(postList);
    }
}
