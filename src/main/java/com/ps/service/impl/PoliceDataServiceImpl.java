package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.PoliceDataMapper;
import com.ps.entity.PoliceData;
import com.ps.service.PoliceDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("PoliceDataService")
public class PoliceDataServiceImpl extends AbstractService<PoliceData> implements PoliceDataService {
    @Resource
    private PoliceDataMapper policeDataMapper;
}
