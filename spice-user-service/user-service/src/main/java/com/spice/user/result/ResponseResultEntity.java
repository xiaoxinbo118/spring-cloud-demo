package com.spice.user.result;

/**
 * Created by sfht on 22/2/2019.
 */
public class ResponseResultEntity<T> {
    // 状态码 正确为0
    private int code = 0;
    // 错误描述
    private String msg = "";

    private T data = null;

    public ResponseResultEntity() {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResultEntity(int code) {
        this.code = code;
    }

    public ResponseResultEntity(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResultEntity(T data) {
        this.data = data;
    }

    public ResponseResultEntity(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
