package com.example.manager.controller;

import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.enums.MessageCodeEnum;
import com.example.manager.pojo.PostInfo;
import com.example.manager.service.IPostInfoService;
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
 * @Description: 岗位
 * @Date:Create：in 2019/11/6 13:43
 */
@RestController
@RequestMapping("/postInfo")
@Api("PostInfoController")
public class PostInfoController extends BaseController {

    private Logger log = LoggerFactory.getLogger(PostInfoController.class);

    @Autowired
    private IPostInfoService postInfoService;
    /**
     * @Description
     * @Date 13:46 2019/11/6
     * @Param [postInfos] 岗位信息数据
     * @return com.example.manager.base.CommonResult
    **/
    @PostMapping("/save")
    @ApiOperation(value = "保存",notes = "保存岗位数据信息")
    public CommonResult save(@RequestBody @ApiParam(name = "岗位数据信息",value = "json",required = true) List<PostInfo> postInfos)throws Exception{
        log.info("---保存岗位数据信息---");
        postInfoService.save(postInfos);
        return CommonResult.success().setMsg("添加成功");
    }

    /**
     * @Description
     * @Date 13:46 2019/11/6
     * @Param [postInfo] 岗位信息数据
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping("/update")
    @ApiOperation(value = "修改",notes = "保存岗位数据信息")
    public CommonResult update(@RequestBody @ApiParam(name = "岗位数据信息",value = "json",required = true) PostInfo postInfo)throws Exception{
        log.info("---保存岗位数据信息---");
        if(StringUtils.isNotEmpty(postInfo.getId())){
            postInfoService.update(postInfo);
            return CommonResult.success().setMsg("添加成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_IS_NULL).setMsg("岗位编号不能为空");
    }
    /**
     * @Description 启用禁用
     * @Date 14:07 2019/11/6
     * @Param [id] 编号
     * @return com.example.manager.base.CommonResult
    **/
    @PostMapping("/hidden/{id}")
    @ApiOperation(value = "禁用/启用",notes = "禁用/启用岗位信息")
    public CommonResult hiddenById(@PathVariable String id)throws Exception{
        if(StringUtils.isNotEmpty(id)){
            log.info("---修改编号为"+id+"的应用状态---");
            //TODO 增加一个启用禁用的方法
//            postInfoService.hiddenById(id);
            return CommonResult.success().setMsg("修改状态成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("岗位编号不能为空");
    }
    @GetMapping("/get/page")
    @ApiOperation(value = "分页",notes = "分页获取所有岗位信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageSize", value = "当前页",required = false,defaultValue = "1",dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "每页展示数量",required = false,defaultValue = "10",dataType = "Integer",paramType = "query")})
    public CommonResult getPage(@RequestParam(value = "pageNum",defaultValue = "1",required = false)Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "10",required = false)Integer pageSize)throws Exception{
        PageHelper.startPage(pageNum,pageSize);
        List<PostInfo> postInfos = postInfoService.getAll();
        PageInfo<PostInfo> list = new PageInfo<>(postInfos);
        return CommonResult.success().setMsg("查询成功").addResult("list",list);
    }



}
