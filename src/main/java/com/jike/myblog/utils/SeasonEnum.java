package com.jike.myblog.utils;

public enum SeasonEnum {
    SPRING(1,"春天"),
    SUMMER(2,"夏天"),
    FALL(3,"秋天"),
    WINTER(4,"冬天");

    private  int code;
    private String description;
    private SeasonEnum(int code,String description){
        this.code=code;
        this.description=description;
    }

    private SeasonEnum(){

    }
}
