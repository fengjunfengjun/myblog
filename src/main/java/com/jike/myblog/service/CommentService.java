package com.jike.myblog.service;

import com.jike.myblog.model.Comment;

import java.util.List;

public interface CommentService {
    public Integer addComent(Comment comment);

    public List<Comment> getCommentsByBlogId(Integer blogId);
}
