package com.jike.myblog.utils;

/**
 * Created by Administrator on 2018/1/4.
 */
public enum ResultEnum {

    //100 开头表示成功
    OK(100001, "请求成功"),
    //200 开头表示用户错误
    NOT_LOGIN(200001, "用户未登录"),
    LOGIN_ERROR(200002, "账号或者密码错误"),
    MAIL_ERROR(200003, "邮箱格式错误"),
    DATE_ERROR(200004, "日期格式错误"),
    USER_FREEZED(200005, "用户被冻结"),
    NULL_DATA(200006, "没有数据"),
    NAME_ERROR(200007, "用户名格式错误"),
    PASSWORD_ERROR(200008, "密码格式错误"),
    EMAIL_IS_REGIST(200009, "邮箱已被注册"),
    NAME_IS_REGIST(200010, "用户名已被注册"),
    WRONG_CODE(200011, "验证码错误"),
    //300
    UNKNOW_ERROR(300001, "未知错误"),
    //400 开头表示参数错误
    PARAM_ERROR(400004, "参数错误"),

    //500开头表示服务器错误
    DATABASE_ERROR(500001, "数据库错误"),
    REDIS_ERROR(500002, "Redis错误"),
    SERVICE_ERROR(500003,"服务端严重错误");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
