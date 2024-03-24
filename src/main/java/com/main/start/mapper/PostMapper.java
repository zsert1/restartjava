package com.main.start.mapper;

import com.main.start.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public List<Post> listPost();
}
