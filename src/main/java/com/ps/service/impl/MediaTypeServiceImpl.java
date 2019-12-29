package com.ps.service.impl;

import com.ps.core.AbstractService;
import com.ps.dao.MediaTypeMapper;
import com.ps.entity.MediaType;
import com.ps.service.MediaTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("MediaTypeService")
public class MediaTypeServiceImpl extends AbstractService<MediaType> implements MediaTypeService {
    @Resource
    private MediaTypeMapper mediaTypeMapper;
}

