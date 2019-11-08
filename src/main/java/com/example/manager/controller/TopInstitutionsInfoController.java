package com.example.manager.controller;

import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.pojo.TopInstitutionsInfo;
import com.example.manager.service.ITopInstitutionsInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: hj
 * @Description: 顶级机构信息
 * @Date:Create：in 2019/11/6 11:14
 */
@RestController
@RequestMapping("/top/organization")
@Api("TopInstitutionsInfoController")
public class TopInstitutionsInfoController extends BaseController {

    private Logger log = LoggerFactory.getLogger(TopInstitutionsInfoController.class);

    @Autowired
    private ITopInstitutionsInfoService topService;

    /**
     * @Description
     * @Date 11:19 2019/11/6
     * @return com.example.manager.base.CommonResult
    **/
    @GetMapping(value = "/get/page")
    @ApiOperation(value = "分页",notes = "分页获取所有顶级机构信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageSize", value = "当前页",required = false,defaultValue = "1",dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "每页展示数量",required = false,defaultValue = "10",dataType = "Integer",paramType = "query")})
    public CommonResult getPage(@RequestParam(value = "pageSize",required = false,defaultValue = "1") Integer pageSize,
                                @RequestParam(value = "pageNum",required = false,defaultValue = "10") Integer pageNum)throws Exception{

        log.info("---分页查询---");
        PageHelper.startPage(pageSize,pageNum);
        List<TopInstitutionsInfo> list = topService.getAll();
        PageInfo<TopInstitutionsInfo> pageInfo = new PageInfo<>(list);
        return CommonResult.success().addResult("list",pageInfo);
    }
    /**
     * @Description 保存
     * @Param [topInstitutionsInfos] 顶级机构信息
     * @return com.example.manager.base.CommonResult
    **/
    @PostMapping(value = "/save")
    @ApiOperation(value = "保存",notes = "保存顶级机构信息")
    public CommonResult save(@RequestBody @ApiParam(name = "顶级机构信息",value = "json",required = true) List<TopInstitutionsInfo> topInstitutionsInfos)throws Exception{
        log.info("---保存顶级机构信息---");
        topService.save(topInstitutionsInfos);
        return CommonResult.success().setMsg("保存成功");
    }
    /**
     * @Description
     * @Param [topInstitutionsInfo] 顶级机构信息
     * @return com.example.manager.base.CommonResult
    **/
    @PostMapping(value = "/update")
    @ApiOperation(value = "修改",notes = "修改顶级机构信息")
    public CommonResult update(@RequestBody @ApiParam(name = "顶级机构信息",value = "json",required = true) TopInstitutionsInfo topInstitutionsInfo)throws Exception{
        if(topInstitutionsInfo != null && StringUtils.isNotEmpty(topInstitutionsInfo.getId())){
            log.info("---修改编号为"+topInstitutionsInfo.getId()+"的顶级机构信息---");
            topService.update(topInstitutionsInfo);
            return CommonResult.success().setMsg("修改成功");
        }
        return CommonResult.fail().setMsg("编号不能为空");
    }




}
