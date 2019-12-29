package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.TestMapper;
import com.ps.entity.Test;
import com.ps.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("TestService")
public class TestServiceImpl extends AbstractService<Test> implements TestService {
    @Resource
    private TestMapper testMapper;
}
