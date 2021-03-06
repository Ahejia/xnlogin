package com.example.manager.controller;


import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.enums.MessageCodeEnum;
import com.example.manager.pojo.ApplicationRole;
import com.example.manager.pojo.MessageResourceRole;
import com.example.manager.service.IApplicationRoleService;
import com.example.manager.service.IMessageResourceRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    private Logger log = LoggerFactory.getLogger(ApplicationRoleController.class);

    @Autowired
    private IMessageResourceRoleService messageResourceRoleService;
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
        log.info("---获取所有的角色信息---");
        List<ApplicationRole> list = roleService.getAll();
        return CommonResult.success().addResult("list",list);
    }

    /**
     * @Description
     * @Date 12:28 2019/10/24
     * @param pageNum 每页展示数量
     * @param pageSize 当前页
     * @return com.example.manager.base.CommonResult
     **/
    @ApiOperation(value = "分页",notes = "分页查询角色信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageSize", value = "当前页",required = false,defaultValue = "1",dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "每页展示数量",required = false,defaultValue = "10",dataType = "Integer",paramType = "query")})
    @GetMapping("/role/get/page")
    public CommonResult getPage(@RequestParam(value = "pageSize",required = false,defaultValue = "1") Integer pageSize,
                                @RequestParam(value = "pageNum",required = false,defaultValue = "10") Integer pageNum)throws Exception{
        log.info("---分页查询资源信息---");
        Integer count = roleService.getCount();
        List<ApplicationRole> roles = roleService.getPage(pageSize, pageNum);
        return CommonResult.success().setMsg("查询成功").addResult("list",roles).addResult("count",count);
    }

    /**
     * @Description  保存应用角色信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping(value = "/role/save")
    @ApiOperation(value = "保存",notes = "保存角色信息")
    public CommonResult save(@RequestBody List<ApplicationRole> applicationRoles)throws Exception{
        List<ApplicationRole>roles = new ArrayList<>();
        if(applicationRoles.size() > 0 && applicationRoles != null){
            for(ApplicationRole applicationRole: applicationRoles){
                if(StringUtils.isEmpty(applicationRole.getApplicationId())){
                    return CommonResult.failed(MessageCodeEnum.PARAMETER_IS_NULL).setMsg("应用编号不能为空");
                }
                //获取序列号
                String nextVal = roleService.getNextVal();
                applicationRole.setId(nextVal);
                roles.add(applicationRole);
            }
            for(ApplicationRole applicationRole: roles){
                //保存信息到关联表
                //未查询到相关信息，新保存
                MessageResourceRole messageResourceRole = new MessageResourceRole();
                messageResourceRole.setRoleId(applicationRole.getId());
                messageResourceRole.setApplicationId(applicationRole.getApplicationId());
                messageResourceRoleService.save(messageResourceRole);
                log.info("---保存应用角色信息---");
                roleService.save(applicationRole);
            }
            return CommonResult.success().setMsg("保存成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID);

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
            log.info("---修改编号为"+applicationRole.getId()+"的角色信息---");
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
    @ApiOperation(value = "禁用/启用",notes = "禁用/启用应用角色信息")
    public CommonResult hiddenById(@PathVariable Long id)throws Exception{
        if(id != null && id > 0){
            log.info("---禁用编号为"+id+"的角色信息---");
            roleService.hiddenById(id);
            return CommonResult.success().setMsg("修改角色编号"+id+"状态成功");
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
            log.info("---删除关联表---");
            //删除关联表
            roleService.deleteByRoleId(id);
            //删除角色
            log.info("---删除编号为"+id+"的角色信息---");
            roleService.deleteById(id);
            return CommonResult.success().setMsg("删除成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("编号不能为空");
    }



}
