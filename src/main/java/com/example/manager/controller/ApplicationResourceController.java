package com.example.manager.controller;


import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.base.MessageCodeEnum;
import com.example.manager.pojo.ApplicationMessage;
import com.example.manager.pojo.ApplicationResource;
import com.example.manager.service.IApplicationMessageService;
import com.example.manager.service.IApplicationResourceService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/23 9:18
 */
@RestController
@RequestMapping(value = "/application")
@Api("ApplicationResourceController")
public class ApplicationResourceController extends BaseController {

    @Autowired
    private IApplicationResourceService resourceService;

    /**
     * @Author hj
     * @Description  获取所有的应用资源信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
    **/
    @GetMapping(value = "resource/get")
    @ApiOperation(value = "获取",notes = "获取资源应用信息")
    public CommonResult get()throws Exception{
        List<ApplicationResource> list = resourceService.getAll();
        return CommonResult.success().addResult("list",list);
    }

    /**
     * @Author hj
     * @Description  保存应用资源信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping(value = "/resource/save")
    @ApiOperation(value = "保存",notes = "保存资源信息")
    public CommonResult save(@RequestBody ApplicationResource applicationResource)throws Exception{
        resourceService.save(applicationResource);
        return CommonResult.success().setMsg("保存成功");
    }

    /**
     * @Author hj
     * @Description  修改资源信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping(value = "/resource/update")
    @ApiOperation(value = "修改",notes = "修改资源信息")
    public CommonResult update(@RequestBody ApplicationResource applicationResource)throws Exception{
        if(applicationResource.getId() != null){
            resourceService.update(applicationResource);
            return CommonResult.success().setMsg("修改成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_IS_NULL).setMsg("资源编号不能为空");
    }

    /**
     * @Author hj
     * @Description 禁用资源
     * @Date 17:12 2019/10/23
     * @Param [id] 应用id
     * @return com.example.manager.base.CommonResult
    **/
    @PostMapping("/resource/hidden/{id}")
    @ApiOperation(value = "禁用",notes = "禁用资源信息")
    public CommonResult hiddenById(@PathVariable Long id)throws Exception{
        if(id != null && id > 0){
            resourceService.hiddenById(id);
            return CommonResult.success().setMsg("禁用成功");
        }
            return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("编号不能为空");
    }

    /**
     * @Author hj
     * @Description 删除应用
     * @Date 17:13 2019/10/23
     * @Param [id] 应用id
    **/
    @ApiOperation(value = "删除",notes = "删除资源信息")
    @PostMapping("/resource/delete/{id}")
    public CommonResult deleteById(@PathVariable Long id)throws Exception{
        if(id != null && id > 0){
            //上级资源为id的置为0
            resourceService.updateParentId(id);
            //删除关联表中的数据
            resourceService.deleteByResourceId(id);
            //删除资源
            resourceService.deleteById(id);
            return CommonResult.success().setMsg("删除成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("编号不能为空");
    }

    /**
     * @Description
     * @Date 12:28 2019/10/24
     * @param pageNum 每页展示数量
     * @param pageSize 当前页
     * @return com.example.manager.base.CommonResult
     **/
    @ApiOperation(value = "分页",notes = "分页查询应用信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageSize", value = "当前页",required = false,defaultValue = "1",dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "每页展示数量",required = false,defaultValue = "10",dataType = "Integer",paramType = "query")})
    @GetMapping("/resource/get/page")
    public CommonResult getPage(@RequestParam(value = "pageSize",required = false,defaultValue = "1") Integer pageSize,
                                @RequestParam(value = "pageNum",required = false,defaultValue = "10") Integer pageNum)throws Exception{
        List<ApplicationResource> resources = resourceService.getPage(pageSize, pageNum);
        return CommonResult.success().setMsg("查询成功").addResult("list",resources);
    }



}
