package com.example.resourcesserver.service;

import com.example.resourcesserver.config.Result;

/**
 * @Author: zhuyuhua
 * @Date: 2022/7/21 15:08
 */
public interface TestService {
    Result<String> test(String request);

}
