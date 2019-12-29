package com.ps.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.core.Result;
import com.ps.core.ResultGenerator;
import com.ps.entity.PoliceData;
import com.ps.service.PoliceDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QY
 */
@RestController
@RequestMapping("/ps/policeData")
public class PoliceDataController {
    @Resource
    private PoliceDataService policeDataService;

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        policeDataService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody PoliceData policeData) {
        policeDataService.update(policeData);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        PoliceData policeData = policeDataService.findById(id);
        return ResultGenerator.genSuccessResult(policeData);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PoliceData> list = policeDataService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
