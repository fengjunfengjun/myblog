package com.jike.myblog.model;

import java.util.ArrayList;
import java.util.List;

public class BlogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlogidIsNull() {
            addCriterion("blogId is null");
            return (Criteria) this;
        }

        public Criteria andBlogidIsNotNull() {
            addCriterion("blogId is not null");
            return (Criteria) this;
        }

        public Criteria andBlogidEqualTo(Integer value) {
            addCriterion("blogId =", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotEqualTo(Integer value) {
            addCriterion("blogId <>", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThan(Integer value) {
            addCriterion("blogId >", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogId >=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThan(Integer value) {
            addCriterion("blogId <", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThanOrEqualTo(Integer value) {
            addCriterion("blogId <=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidIn(List<Integer> values) {
            addCriterion("blogId in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotIn(List<Integer> values) {
            addCriterion("blogId not in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidBetween(Integer value1, Integer value2) {
            addCriterion("blogId between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("blogId not between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogtitleIsNull() {
            addCriterion("blogTitle is null");
            return (Criteria) this;
        }

        public Criteria andBlogtitleIsNotNull() {
            addCriterion("blogTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBlogtitleEqualTo(String value) {
            addCriterion("blogTitle =", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotEqualTo(String value) {
            addCriterion("blogTitle <>", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleGreaterThan(String value) {
            addCriterion("blogTitle >", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleGreaterThanOrEqualTo(String value) {
            addCriterion("blogTitle >=", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLessThan(String value) {
            addCriterion("blogTitle <", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLessThanOrEqualTo(String value) {
            addCriterion("blogTitle <=", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLike(String value) {
            addCriterion("blogTitle like", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotLike(String value) {
            addCriterion("blogTitle not like", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleIn(List<String> values) {
            addCriterion("blogTitle in", values, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotIn(List<String> values) {
            addCriterion("blogTitle not in", values, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleBetween(String value1, String value2) {
            addCriterion("blogTitle between", value1, value2, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotBetween(String value1, String value2) {
            addCriterion("blogTitle not between", value1, value2, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtimeIsNull() {
            addCriterion("blogTime is null");
            return (Criteria) this;
        }

        public Criteria andBlogtimeIsNotNull() {
            addCriterion("blogTime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogtimeEqualTo(String value) {
            addCriterion("blogTime =", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeNotEqualTo(String value) {
            addCriterion("blogTime <>", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeGreaterThan(String value) {
            addCriterion("blogTime >", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeGreaterThanOrEqualTo(String value) {
            addCriterion("blogTime >=", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeLessThan(String value) {
            addCriterion("blogTime <", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeLessThanOrEqualTo(String value) {
            addCriterion("blogTime <=", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeLike(String value) {
            addCriterion("blogTime like", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeNotLike(String value) {
            addCriterion("blogTime not like", value, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeIn(List<String> values) {
            addCriterion("blogTime in", values, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeNotIn(List<String> values) {
            addCriterion("blogTime not in", values, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeBetween(String value1, String value2) {
            addCriterion("blogTime between", value1, value2, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBlogtimeNotBetween(String value1, String value2) {
            addCriterion("blogTime not between", value1, value2, "blogtime");
            return (Criteria) this;
        }

        public Criteria andBloglableIsNull() {
            addCriterion("blogLable is null");
            return (Criteria) this;
        }

        public Criteria andBloglableIsNotNull() {
            addCriterion("blogLable is not null");
            return (Criteria) this;
        }

        public Criteria andBloglableEqualTo(String value) {
            addCriterion("blogLable =", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableNotEqualTo(String value) {
            addCriterion("blogLable <>", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableGreaterThan(String value) {
            addCriterion("blogLable >", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableGreaterThanOrEqualTo(String value) {
            addCriterion("blogLable >=", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableLessThan(String value) {
            addCriterion("blogLable <", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableLessThanOrEqualTo(String value) {
            addCriterion("blogLable <=", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableLike(String value) {
            addCriterion("blogLable like", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableNotLike(String value) {
            addCriterion("blogLable not like", value, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableIn(List<String> values) {
            addCriterion("blogLable in", values, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableNotIn(List<String> values) {
            addCriterion("blogLable not in", values, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableBetween(String value1, String value2) {
            addCriterion("blogLable between", value1, value2, "bloglable");
            return (Criteria) this;
        }

        public Criteria andBloglableNotBetween(String value1, String value2) {
            addCriterion("blogLable not between", value1, value2, "bloglable");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}