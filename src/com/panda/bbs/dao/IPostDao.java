package com.panda.bbs.dao;

import com.panda.bbs.domain.Post;

import java.util.List;

public interface IPostDao {
    public List<Post> getAllPost();
    public Post getPostById(int postId);
    public List<Post> getPostByTitle();

}
