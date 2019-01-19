package com.jike.myblog.model;

public class Comment {
    private Integer commentid;

    private Integer commentblogid;

    private String commenttime;

    private String commentcontent;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getCommentblogid() {
        return commentblogid;
    }

    public void setCommentblogid(Integer commentblogid) {
        this.commentblogid = commentblogid;
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime == null ? null : commenttime.trim();
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Comment other = (Comment) that;
        return (this.getCommentid() == null ? other.getCommentid() == null : this.getCommentid().equals(other.getCommentid()))
            && (this.getCommentblogid() == null ? other.getCommentblogid() == null : this.getCommentblogid().equals(other.getCommentblogid()))
            && (this.getCommenttime() == null ? other.getCommenttime() == null : this.getCommenttime().equals(other.getCommenttime()))
            && (this.getCommentcontent() == null ? other.getCommentcontent() == null : this.getCommentcontent().equals(other.getCommentcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentid() == null) ? 0 : getCommentid().hashCode());
        result = prime * result + ((getCommentblogid() == null) ? 0 : getCommentblogid().hashCode());
        result = prime * result + ((getCommenttime() == null) ? 0 : getCommenttime().hashCode());
        result = prime * result + ((getCommentcontent() == null) ? 0 : getCommentcontent().hashCode());
        return result;
    }
}