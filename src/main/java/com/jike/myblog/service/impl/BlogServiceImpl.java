package com.jike.myblog.service.impl;


import com.jike.myblog.dao.defined.BlogDefinedMapper;
import com.jike.myblog.dao.generate.BlogMapper;
import com.jike.myblog.model.Blog;
import com.jike.myblog.service.BlogService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogMapper blogMapper;

    @Autowired
    BlogDefinedMapper blogDefinedMapper;


    @Override
    public Blog getBlogdetail(Integer blogId) {
        Blog blog=null;
       try {
           blog=blogMapper.selectByPrimaryKey(blogId);
       }catch (Exception e){
           e.printStackTrace();
       }
        return blog;
    }

    @Override
    public List<Map<String, Object>> getBlogbyPage(Integer pageNum) {
        int offset=(pageNum-1)*4;
        RowBounds rowBounds=new RowBounds(offset, 4);
        List<Map<String, Object>> result=null;
        try {
            result=blogDefinedMapper.getBlogbyPage(rowBounds);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Map<String, Object>> getAlLBlog(Integer pageNum) {
        int offset=(pageNum-1)*8;
        RowBounds rowBounds=new RowBounds(offset, 8);
        List<Map<String, Object>> result=null;
        try {
            result=blogDefinedMapper.getAlLBlog(rowBounds);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
