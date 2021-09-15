package com.test.service.impl;


import com.github.pagehelper.Page;
import com.test.mapper.TestMapper;
import com.test.pojo.Test;
import com.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;


@Service
public class TestServiceImpl implements TestService {

    @Resource
    TestMapper testMapper;


    @Override
    public Page<Test> selectByCondition(String name, String sex, Date createTime) {
        return testMapper.selectByCondition(name, sex, createTime);
    }
}
