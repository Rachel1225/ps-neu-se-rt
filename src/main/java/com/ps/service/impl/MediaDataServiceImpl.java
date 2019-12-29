package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.MediaDataMapper;
import com.ps.entity.MediaData;
import com.ps.service.MediaDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("MediaDataService")
public class MediaDataServiceImpl extends AbstractService<MediaData> implements MediaDataService {

    @Resource
    private MediaDataMapper mediaDataMapper;
}
