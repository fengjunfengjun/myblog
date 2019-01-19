package com.jike.myblog.controller;



import com.alibaba.fastjson.JSONObject;
import com.jike.myblog.model.Blog;
import com.jike.myblog.model.Comment;
import com.jike.myblog.service.BlogService;
import com.jike.myblog.service.CommentService;
import com.jike.myblog.utils.ResultEnum;
import com.jike.myblog.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/addComment")
    public JSONObject addComment(Comment comment){
        System.out.println(comment.getCommentcontent());
        System.out.println(comment.getCommentblogid());
       commentService.addComent(comment);
        return ResultUtil.success();
    }


    @GetMapping("/getCommentsByBlogId")
    public JSONObject getCommentsByBlogId(Integer blogId){
        if (blogId==null||"".equals(blogId)){
            return ResultUtil.fail(ResultEnum.PARAM_ERROR);
        }

        List<Comment> result=commentService.getCommentsByBlogId(blogId);
        return ResultUtil.success(result);
    }


}
