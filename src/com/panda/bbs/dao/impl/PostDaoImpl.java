package com.panda.bbs.dao.impl;

import com.panda.bbs.dao.IPostDao;
import com.panda.bbs.domain.Post;
import com.panda.bbs.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PostDaoImpl implements IPostDao {
    QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    @Override
    public List<Post> getAllPost() throws SQLException {
        String sql = "select ";
        List<Post> postList = qr.query(sql,new BeanListHandler<Post>(Post.class));
        return postList;
    }

    @Override
    public Post getPostByPostId(int postId) throws SQLException {
        String sql = "";
        Post post = qr.query(sql,new BeanHandler<Post>(Post.class));
        return post;
    }

    @Override
    public List<Post> getPostByUserId(int userId) throws SQLException {
        String sql = "";
        List<Post> postList = qr.query(sql,new BeanListHandler<Post>(Post.class));
        return postList;
    }

    @Override
    public List<Post> getPostByTitle(String title) throws SQLException {
        String sql = "";
        List<Post> postList = qr.query(sql,new BeanListHandler<Post>(Post.class));
        return postList;
    }

    @Override
    public void insertPost(Post post) throws SQLException {
        String sql = "";
        qr.update(sql);
    }

    @Override
    public void updatePost(Post post) throws SQLException {
        String sql = "";
        qr.update(sql);
    }

    @Override
    public void deletePostById(int id) throws SQLException {
        String sql = "";
        qr.update(sql,id);
    }

}
