package com.ps.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.core.Result;
import com.ps.core.ResultGenerator;
import com.ps.entity.MediaData;
import com.ps.service.MediaDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QY
 */
@RestController
@RequestMapping("/ps/mediaData")
public class MediaDataController {
    @Resource
    private MediaDataService mediaDataService;

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        mediaDataService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody MediaData mediaData) {
        mediaDataService.update(mediaData);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        MediaData mediaData = mediaDataService.findById(id);
        return ResultGenerator.genSuccessResult(mediaData);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MediaData> list = mediaDataService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
