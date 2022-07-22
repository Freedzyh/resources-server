package com.example.resourcesserver.config;

/**
 * @Author: zhuyuhua
 * @Date: 2022/7/21 15:07
 */
public interface ErrorCode {

    /**
     * 获取错误码
     *
     * @return
     */
    long getCode();

    /**
     * 获取错误描述
     *
     * @return
     */
    String getDesc();

}
