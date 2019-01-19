package com.jike.myblog.controller;



import com.alibaba.fastjson.JSONObject;
import com.jike.myblog.model.Blog;
import com.jike.myblog.service.BlogService;
import com.jike.myblog.utils.ResultEnum;
import com.jike.myblog.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/getBlogbyPage")
    public JSONObject getBlogbyPage(@RequestParam(value = "pageNum", required = false, defaultValue = "1")Integer pageNum){
        System.out.println(pageNum);
        List<Map<String,Object>> result=blogService.getBlogbyPage(pageNum);
        return ResultUtil.success(result);
    }


    @GetMapping("/getBlogdetail")
    public JSONObject getBlogdetail(Integer blogId){
        if (blogId==null||"".equals(blogId)){
            return ResultUtil.fail(ResultEnum.PARAM_ERROR);
        }

        Blog blog=blogService.getBlogdetail(blogId);
        return ResultUtil.success(blog);
    }

    @GetMapping("/getAlLBlog")
    public JSONObject getAlLBlog(@RequestParam(value = "pageNum", required = false, defaultValue = "1")Integer pageNum){
        System.out.println(pageNum);
        List<Map<String,Object>> result=blogService.getAlLBlog(pageNum);
        return ResultUtil.success(result);
    }


}
