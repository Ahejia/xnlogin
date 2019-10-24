package com.example.manager.controller;


import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.base.MessageCodeEnum;
import com.example.manager.pojo.ApplicationResource;
import com.example.manager.pojo.ApplicationRole;
import com.example.manager.service.IApplicationResourceService;
import com.example.manager.service.IApplicationRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api("ApplicationRoleController")
public class ApplicationRoleController extends BaseController {

    @Autowired
    private IApplicationRoleService roleService;

    /**
     * @Description  获取所有的应用角色信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
    **/
    @GetMapping(value = "role/get")
    @ApiOperation(value = "获取",notes = "获取应用角色信息")
    public CommonResult get()throws Exception{
        List<ApplicationRole> list = roleService.getAll();
        return CommonResult.success().addResult("list",list);
    }

    /**
     * @Description  保存应用角色信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping(value = "/role/save")
    @ApiOperation(value = "保存",notes = "保存角色信息")
    public CommonResult save(@RequestBody ApplicationRole applicationRole)throws Exception{
        roleService.save(applicationRole);
        return CommonResult.success().setMsg("保存成功");
    }

    /**
     * @Description  修改角色信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping(value = "/role/update")
    @ApiOperation(value = "修改",notes = "修改角色信息")
    public CommonResult update(@RequestBody ApplicationRole applicationRole)throws Exception{
        if(applicationRole.getId() != null){
            roleService.update(applicationRole);
            return CommonResult.success().setMsg("修改成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_IS_NULL).setMsg("角色编号不能为空");
    }

    /**
     * @Description 禁用角色
     * @Date 17:12 2019/10/23
     * @Param [id] 角色id
     * @return com.example.manager.base.CommonResult
    **/
    @PostMapping("/role/hidden/{id}")
    @ApiOperation(value = "禁用",notes = "禁用应用角色信息")
    public CommonResult hiddenById(@PathVariable Long id)throws Exception{
        if(id != null && id > 0){
            roleService.hiddenById(id);
            return CommonResult.success().setMsg("禁用成功");
        }
            return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("编号不能为空");
    }

    /**
     * @Description 删除角色
     * @Date 17:13 2019/10/23
     * @Param [id] 角色id
    **/
    @ApiOperation(value = "删除",notes = "删除应用角色信息")
    @PostMapping("/role/delete/{id}")
    public CommonResult deleteById(@PathVariable Long id)throws Exception{
        if(id != null && id > 0){
            //删除关联表
            roleService.deleteByRoleId(id);
            //删除角色
            roleService.deleteById(id);
            return CommonResult.success().setMsg("删除成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("编号不能为空");
    }



}
