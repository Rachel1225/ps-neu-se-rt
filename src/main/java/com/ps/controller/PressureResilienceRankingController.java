package com.ps.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.core.Result;
import com.ps.core.ResultGenerator;
import com.ps.entity.PressureResilienceRanking;
import com.ps.service.PressureResilienceRankingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QY
 */

@RestController
@RequestMapping("/ps/pressure")
public class PressureResilienceRankingController {
    @Resource
    private PressureResilienceRankingService pressureResilienceRankingService;

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        pressureResilienceRankingService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody PressureResilienceRanking pressureResilienceRanking) {
        pressureResilienceRankingService.update(pressureResilienceRanking);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        PressureResilienceRanking pressureResilienceRanking = pressureResilienceRankingService.findById(id);
        return ResultGenerator.genSuccessResult(pressureResilienceRanking);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PressureResilienceRanking> list = pressureResilienceRankingService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
