package com.walle.sbmybatis.utils;

public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    NO_BODY(1, "查无此人"),
    PRIMARY_SCHOOL(100, "你可能还在上小学"),
    MIDDLE_SCHOOL(101, "你可能在上初中");
    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}