package com.example.resourcesserver.service.impl;

import com.example.resourcesserver.config.Result;
import com.example.resourcesserver.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: zhuyuhua
 * @Date: 2022/7/21 15:09
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {
    @Override
    public Result<String> test(String request) {
        return Result.success(request);
    }
}
