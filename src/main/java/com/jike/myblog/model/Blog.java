package com.jike.myblog.model;

public class Blog {
    private Integer blogid;

    private String blogtitle;

    private String blogtime;

    private String bloglable;

    private String blogcontent;

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle == null ? null : blogtitle.trim();
    }

    public String getBlogtime() {
        return blogtime;
    }

    public void setBlogtime(String blogtime) {
        this.blogtime = blogtime == null ? null : blogtime.trim();
    }

    public String getBloglable() {
        return bloglable;
    }

    public void setBloglable(String bloglable) {
        this.bloglable = bloglable == null ? null : bloglable.trim();
    }

    public String getBlogcontent() {
        return blogcontent;
    }

    public void setBlogcontent(String blogcontent) {
        this.blogcontent = blogcontent == null ? null : blogcontent.trim();
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
        Blog other = (Blog) that;
        return (this.getBlogid() == null ? other.getBlogid() == null : this.getBlogid().equals(other.getBlogid()))
            && (this.getBlogtitle() == null ? other.getBlogtitle() == null : this.getBlogtitle().equals(other.getBlogtitle()))
            && (this.getBlogtime() == null ? other.getBlogtime() == null : this.getBlogtime().equals(other.getBlogtime()))
            && (this.getBloglable() == null ? other.getBloglable() == null : this.getBloglable().equals(other.getBloglable()))
            && (this.getBlogcontent() == null ? other.getBlogcontent() == null : this.getBlogcontent().equals(other.getBlogcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBlogid() == null) ? 0 : getBlogid().hashCode());
        result = prime * result + ((getBlogtitle() == null) ? 0 : getBlogtitle().hashCode());
        result = prime * result + ((getBlogtime() == null) ? 0 : getBlogtime().hashCode());
        result = prime * result + ((getBloglable() == null) ? 0 : getBloglable().hashCode());
        result = prime * result + ((getBlogcontent() == null) ? 0 : getBlogcontent().hashCode());
        return result;
    }
}