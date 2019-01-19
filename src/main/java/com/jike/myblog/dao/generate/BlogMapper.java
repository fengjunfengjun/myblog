package com.jike.myblog.dao.generate;

import com.jike.myblog.model.Blog;
import com.jike.myblog.model.BlogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    long countByExample(BlogCriteria example);

    int deleteByExample(BlogCriteria example);

    int deleteByPrimaryKey(Integer blogid);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExampleWithBLOBs(BlogCriteria example);

    List<Blog> selectByExample(BlogCriteria example);

    Blog selectByPrimaryKey(Integer blogid);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogCriteria example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogCriteria example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
}