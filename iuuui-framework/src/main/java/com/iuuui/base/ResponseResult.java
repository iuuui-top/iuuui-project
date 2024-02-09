package com.iuuui.base;


import java.util.HashMap;

public class ResponseResult {

    private Integer code;

    private String msg;

    private Object data;

    public static ResponseResult success() {
        return success(null);
    }

    public static ResponseResult success(String msg, Object data) {
        return new ResponseResult(200, msg, data);
    }

    public static ResponseResult success(Object data) {
        return success("ok", data);
    }

    public static ResponseResult error(String msg) {
        return new ResponseResult(500, msg, null);
    }

    public static ResponseResult success(Object key, Object value) {
        HashMap map = new HashMap() {{
            put(key, value);
        }};
        return success(map);
    }

    private ResponseResult() {
    }

    private ResponseResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
