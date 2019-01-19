package com.jike.myblog.service;

import com.jike.myblog.model.Blog;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogService {
   public Blog getBlogdetail(Integer blogId);

   public List<Map<String,Object>>getBlogbyPage(Integer pageNum);

   public List<Map<String,Object>> getAlLBlog(Integer pageNum);
}
