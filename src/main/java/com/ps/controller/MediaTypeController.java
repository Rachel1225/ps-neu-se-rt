package com.ps.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.core.Result;
import com.ps.core.ResultGenerator;
import com.ps.entity.MediaType;
import com.ps.service.MediaTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QY
 */
@RestController
@RequestMapping("/ps/mediaType")
public class MediaTypeController {
    @Resource
    private MediaTypeService mediaTypeService;

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        mediaTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody MediaType mediaType) {
        mediaTypeService.update(mediaType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        MediaType mediaType = mediaTypeService.findById(id);
        return ResultGenerator.genSuccessResult(mediaType);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MediaType> list = mediaTypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
