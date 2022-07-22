package com.example.resourcesserver.config;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: zhuyuhua
 * @Date: 2022/7/21 15:07
 */
@Data
@ToString
public class Result<T> implements Serializable {

    private long statusCode;

    private String message;

    private T data;

    protected Result() {
    }

    protected Result(long statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> success() {
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc(), null);
    }

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc(), data);
    }

    /**
     * 成功
     *
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data, String message) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 错误
     *
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> Result<T> failed(ErrorCode errorCode) {
        return new Result<T>(errorCode.getCode(), errorCode.getDesc(), null);
    }

    /**
     * 错误
     *
     * @param errorCode
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> failed(ErrorCode errorCode, T data) {
        return new Result<T>(errorCode.getCode(), errorCode.getDesc(), data);
    }

    /**
     * 错误
     *
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> Result<T> failed(long code, String message) {
        return new Result<T>(code, message, null);
    }

    /**
     * 失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> Result<T> failed(String message) {
        return new Result<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> Result<T> failed() {
        return failed(ResultCode.FAILED);
    }

}
