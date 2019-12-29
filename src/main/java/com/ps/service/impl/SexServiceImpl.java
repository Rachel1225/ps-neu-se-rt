package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.SexMapper;
import com.ps.entity.Sex;
import com.ps.service.SexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("SexService")
public class SexServiceImpl extends AbstractService<Sex> implements SexService {
    @Resource
    private SexMapper sexMapper;
}
