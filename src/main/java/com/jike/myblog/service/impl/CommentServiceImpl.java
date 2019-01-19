package com.jike.myblog.service.impl;

import com.jike.myblog.dao.generate.CommentMapper;
import com.jike.myblog.model.Comment;
import com.jike.myblog.model.CommentCriteria;
import com.jike.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;
    @Override
    public Integer addComent(Comment comment) {
        int n=0;

        comment.setCommenttime(new Date().toString());
        try {
            n=commentMapper.insert(comment);
        }catch (Exception e){
            e.printStackTrace();
        }
        return n;
    }

    @Override
    public List<Comment> getCommentsByBlogId(Integer blogId) {
        CommentCriteria commentCriteria=new CommentCriteria();
        commentCriteria.createCriteria().andCommentblogidEqualTo(blogId);
        List<Comment> result=null;

        try {
            result=commentMapper.selectByExample(commentCriteria);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
