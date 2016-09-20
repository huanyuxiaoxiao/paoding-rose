package net.paoding.rose.exception;

import net.paoding.rose.web.ControllerErrorHandler;

/**
 * Created by Tibers on 16/9/20.
 * 类型装换异常类,可以在{@link ControllerErrorHandler }中获取异常信息
 */
public class ParamFormatException extends Exception{
    private String msg;

    /**
     * 异常类
     * @param msg
     */
    public ParamFormatException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
