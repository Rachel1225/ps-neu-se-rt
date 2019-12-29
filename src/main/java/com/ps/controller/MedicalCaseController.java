package com.ps.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.core.Result;
import com.ps.core.ResultGenerator;
import com.ps.entity.MedicalCase;
import com.ps.service.MedicalCaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QY
 */
@RestController
@RequestMapping("/ps/medicalCase")
public class MedicalCaseController {
    @Resource
    private MedicalCaseService medicalCaseService;

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        medicalCaseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody MedicalCase mediaType) {
        medicalCaseService.update(mediaType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        MedicalCase mediaType = medicalCaseService.findById(id);
        return ResultGenerator.genSuccessResult(mediaType);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MedicalCase> list = medicalCaseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
