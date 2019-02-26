package com.spice.user.result;

/**
 * Created by sfht on 22/2/2019.
 */
public class ExceptionEntity {
    // 状态码 正确为0
    private int code = 0;
    private String msg = "";

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
