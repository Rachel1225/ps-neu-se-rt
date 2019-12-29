package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.HasDiseaseMapper;
import com.ps.entity.HasDisease;
import com.ps.service.HasDiseaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("HasDiseaseService")
public class HasDiseaseServiceImpl extends AbstractService<HasDisease> implements HasDiseaseService {
    @Resource
    private HasDiseaseMapper hasDiseaseMapper;
}
