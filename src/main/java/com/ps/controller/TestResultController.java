package com.ps.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.core.Result;
import com.ps.core.ResultGenerator;
import com.ps.entity.TestResult;
import com.ps.service.TestResultService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QY
 */
@RestController
@RequestMapping("/ps/testResult")
public class TestResultController {
    @Resource
    private TestResultService testResultService;

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        testResultService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TestResult testResult) {
        testResultService.update(testResult);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        TestResult TestResult = testResultService.findById(id);
        return ResultGenerator.genSuccessResult(TestResult);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TestResult> list = testResultService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
