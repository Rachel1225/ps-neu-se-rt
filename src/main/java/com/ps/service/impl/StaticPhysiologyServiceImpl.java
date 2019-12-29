package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.StaticPhysiologyMapper;
import com.ps.entity.StaticPhysiology;
import com.ps.service.StaticPhysiologyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("StaticPhysiologyService")
public class StaticPhysiologyServiceImpl extends AbstractService<StaticPhysiology> implements StaticPhysiologyService {
    @Resource
    private StaticPhysiologyMapper staticPhysiologyMapper;
}
