package com.spice.user;

/**
 * Created by sfht on 22/2/2019.
 */
public class SpiceException extends Exception {
    // 状态码 正确为0
    private int code = 0;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public SpiceException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
