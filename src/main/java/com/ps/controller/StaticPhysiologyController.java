package com.ps.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.core.Result;
import com.ps.core.ResultGenerator;
import com.ps.entity.StaticPhysiology;
import com.ps.service.StaticPhysiologyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QY
 */
@RestController
@RequestMapping("/ps/staticPhysiology")
public class StaticPhysiologyController {
    @Resource
    private StaticPhysiologyService staticPhysiologyService;

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        staticPhysiologyService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody StaticPhysiology staticPhysiology) {
        staticPhysiologyService.update(staticPhysiology);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        StaticPhysiology staticPhysiology = staticPhysiologyService.findById(id);
        return ResultGenerator.genSuccessResult(staticPhysiology);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<StaticPhysiology> list = staticPhysiologyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
