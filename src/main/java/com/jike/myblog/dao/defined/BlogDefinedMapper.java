package com.jike.myblog.dao.defined;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;


/**
 * @Author: FJ
 * @Date: Create in 17:39 2018/12/3
 */
public interface BlogDefinedMapper {

    public List<Map<String, Object>> getBlogbyPage(RowBounds rowBounds);

    public List<Map<String, Object>> getAlLBlog(RowBounds rowBounds);


}
