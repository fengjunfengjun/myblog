package com.jike.myblog.dao.generate;

import com.jike.myblog.model.Comment;
import com.jike.myblog.model.CommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    long countByExample(CommentCriteria example);

    int deleteByExample(CommentCriteria example);

    int deleteByPrimaryKey(Integer commentid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBs(CommentCriteria example);

    List<Comment> selectByExample(CommentCriteria example);

    Comment selectByPrimaryKey(Integer commentid);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentCriteria example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentCriteria example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
}