package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.PressureResilienceRankingMapper;
import com.ps.entity.PressureResilienceRanking;
import com.ps.service.PressureResilienceRankingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("PressureResilienceRankingService")
public class PressureResilienceRankingServiceImpl extends AbstractService<PressureResilienceRanking> implements PressureResilienceRankingService {

    @Resource
    private PressureResilienceRankingMapper pressureResilienceRankingMapper;
}
