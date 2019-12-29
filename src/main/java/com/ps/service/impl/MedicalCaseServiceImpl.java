package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.MedicalCaseMapper;
import com.ps.entity.MedicalCase;
import com.ps.service.MedicalCaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("MedicalCaseService")
public class MedicalCaseServiceImpl extends AbstractService<MedicalCase> implements MedicalCaseService {
    @Resource
    private MedicalCaseMapper medicalCaseMapper;
}
