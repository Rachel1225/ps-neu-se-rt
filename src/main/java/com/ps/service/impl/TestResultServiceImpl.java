package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.TestResultMapper;
import com.ps.entity.TestResult;
import com.ps.service.TestResultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("TestResultService")
public class TestResultServiceImpl extends AbstractService<TestResult> implements TestResultService {
    @Resource
    private TestResultMapper testResultMapper;
}
