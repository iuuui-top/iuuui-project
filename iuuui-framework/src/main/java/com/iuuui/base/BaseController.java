package com.iuuui.base;




/**
 * @author iuuui
 * @since 2023/02/16 1733
 */
public class BaseController {

    public static ResponseResult success() {
        return ResponseResult.success();
    }

    public static ResponseResult success(String msg, Object data) {
        return ResponseResult.success(msg, data);
    }

    public static ResponseResult success(Object data) {
        return ResponseResult.success(data);
    }

    public static ResponseResult successMap(Object key, Object value) {
        return ResponseResult.success(key, value);
    }

    public static ResponseResult error(String msg) {
        return ResponseResult.error(msg);
    }


}
