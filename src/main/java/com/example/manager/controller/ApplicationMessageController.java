package com.example.manager.controller;


import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.enums.MessageCodeEnum;
import com.example.manager.pojo.ApplicationMessage;
import com.example.manager.service.IApplicationMessageService;
import com.example.manager.service.IApplicationResourceService;
import com.example.manager.service.IApplicationRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
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
@Api("ApplicationMessageController")
public class ApplicationMessageController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(ApplicationMessageController.class);

    @Autowired
    private IApplicationMessageService messageService;
    @Autowired
    private IApplicationResourceService resourceService;
    @Autowired
    private IApplicationRoleService roleService;

    /**
     * @Author hj
     * @Description  获取所有的应用信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
    **/
    @GetMapping(value = "message/get")
    @ApiOperation(value = "获取",notes = "获取所有应用信息")
    public CommonResult get()throws Exception{
        logger.info("---获取所有应用信息---");
        List<ApplicationMessage> list = messageService.getAll();
        return CommonResult.success().addResult("list",list);
    }

    /**
     * @Author hj
     * @Description  保存应用信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping(value = "/message/save")
    @ApiOperation(value = "保存",notes = "保存应用信息")
    public CommonResult save(@RequestBody @ApiParam(name = "应用信息对象",value = "json",required = true) List<ApplicationMessage> applicationMessages)throws Exception{
        List<String> list = new ArrayList<>();
        if(applicationMessages.size() > 0 && applicationMessages != null){
            for(ApplicationMessage applicationMessage : applicationMessages){
                //获取序列号
                String nextVal = messageService.getNextVal();
                applicationMessage.setId(nextVal);
                logger.info("---保存应用信息---");
                messageService.save(applicationMessage);
                list.add(nextVal);
            }
            return CommonResult.success().setMsg("保存成功").addResult("ids",list);
        }
        return CommonResult.failed(MessageCodeEnum.NO_DATA);

    }

    /**
     * @Author hj
     * @Description  修改应用信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping(value = "/message/update")
    @ApiOperation(value = "修改",notes = "修改应用信息")
    public CommonResult update(@RequestBody ApplicationMessage applicationMessage)throws Exception{
        if(applicationMessage.getId() != null){
            logger.info("---修改应用信息---");
            messageService.update(applicationMessage);
            return CommonResult.success().setMsg("修改成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_IS_NULL).setMsg("应用编号不能为空");
    }

    /**
     * @Author hj
     * @Description 禁用应用
     * @Date 17:12 2019/10/23
     * @Param [id] 应用id
    **/
    @PostMapping("/message/hidden/{id}")
    @ApiOperation(value = "禁用/启用",notes = "禁用/启用应用信息")
    public CommonResult hiddenById(@PathVariable Long id)throws Exception{
        if(id != null && id > 0){
            logger.info("---修改编号为"+id+"的应用状态---");
            messageService.hiddenById(id);
            return CommonResult.success().setMsg("修改状态成功");
        }
            return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("应用编号不能为空");
    }

    /**
     * @Author hj
     * @Description 删除应用 TODO
     * @Date 17:13 2019/10/23
     * @Param [id] 应用id
    **/
    @ApiOperation(value = "删除",notes = "删除应用信息")
    @PostMapping("/message/delete/{id}")
    public CommonResult deleteById(@PathVariable Long id)throws Exception{
        if(id != null && id > 0){
            logger.info("---把资源表应用id为"+id+"的信息置为0---");
            //对应的资源表中的应用id置为0
            resourceService.updateApplicationId(id);
            logger.info("---把角色表应用id为"+id+"的信息置为0---");
            //对应的角色表中应用id置为0
            roleService.updateApplicationId(id);
            logger.info("---删除关联表中应用id为"+id+"的数据信息---");
            //删除关联表中数据
            messageService.deleteByApplicationId(id);
            //删除应用
            logger.info("---删除应用编号为"+id+"的应用信息---");
            messageService.deleteById(id);
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
    @GetMapping("/message/get/page")
    public CommonResult getPage(@RequestParam(value = "pageSize",required = false,defaultValue = "1") Integer pageSize,
                                @RequestParam(value = "pageNum",required = false,defaultValue = "10") Integer pageNum)throws Exception{
        PageHelper.startPage(pageSize,pageNum);
        List<ApplicationMessage> list = messageService.getAll();
        PageInfo<ApplicationMessage> pageInfo = new PageInfo<>(list);
        return CommonResult.success().addResult("list",pageInfo);
//        logger.info("---分页查询---");
//        List<ApplicationMessage> messages = messageService.getPage(pageSize, pageNum);
//        Integer count = messageService.getCount();
//        return CommonResult.success().setMsg("查询成功").addResult("list",messages).addResult("count",count);
    }

    /**
     * @Author hj
     * @Description  获取所有的应用信息
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @GetMapping(value = "message/get/name")
    @ApiOperation(value = "获取编号与名称",notes = "获取应用信息的名称与编号")
    public CommonResult getAllMessageName()throws Exception{
        logger.info("---获取编号与名称---");
        List<ApplicationMessage> list = messageService.getAllMessageName();
        return CommonResult.success().addResult("list",list);
    }

    /**
     * @Author hj
     * @Description  查询单个应用
     * @Date 16:17 2019/10/23
     * @return com.example.manager.base.CommonResult
     **/
    @GetMapping(value = "message/get/{id}")
    @ApiOperation(value = "根据id查询应用信息",notes = "根据id查询应用信息")
    public CommonResult getMessageById(@PathVariable String id)throws Exception{
        logger.info("---获取编号与名称---");
        List<ApplicationMessage> list = messageService.getStrById(id);
        return CommonResult.success().addResult("list",list);
    }


}
