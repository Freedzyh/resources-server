package com.example.resourcesserver.exception;

import java.text.MessageFormat;

/**
 * @Author: zhuyuhua
 * @Date: 2022/7/21 15:07
 */
public class BizException extends RuntimeException {

    private int code;

    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(int code, String message, Object... args) {
        this(code, MessageFormat.format(message, args));
    }

    public BizException(int code) {
        this.code = code;
    }

    public BizException(String message) {
        this(500, message);
    }

    public BizException(String message, Object... args) {
        this(500, message, args);
    }

    public int getCode() {
        return code;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

}