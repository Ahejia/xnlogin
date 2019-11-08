package com.example.manager.controller;

import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.enums.MessageCodeEnum;
import com.example.manager.pojo.Organization;
import com.example.manager.pojo.OrganizationTypeCode;
import com.example.manager.service.IOrganizationService;
import com.example.manager.service.IOrganizationTypeCodeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: hj
 * @Description: 机构类型
 * @Date:Create：in 2019/11/6 14:16
 */
@RestController
@RequestMapping("/organization/type")
public class OrganizationTypeCodeController extends BaseController {

    private Logger log = LoggerFactory.getLogger(OrganizationTypeCodeController.class);
    @Autowired
    private IOrganizationTypeCodeService organizationTypeCodeService;
    @Autowired
    private IOrganizationService organizationService;
    /**
     * @Description 保存机构类型
     * @Param [organizationTypeCodes] 机构类型数据
     * @return CommonResult
    **/
    @PostMapping("/save")
    @ApiOperation(value = "保存",notes = "保存机构类型")
    public CommonResult save(@RequestBody @ApiParam(value = "机构类型代码信息",name = "json",required = true) List<OrganizationTypeCode> organizationTypeCodes)throws Exception{
        log.info("---保存机构类型数据---");
        organizationTypeCodeService.save(organizationTypeCodes);
        return CommonResult.success().setMsg("保存成功");
    }
    /**
     * @Description 修改机构类型
     * @Param [organizationTypeCodes] 机构类型数据
     * @return CommonResult
     **/
    @PostMapping("/update")
    @ApiOperation(value = "保存",notes = "修改机构类型")
    public CommonResult update(@RequestBody @ApiParam(value = "机构类型代码信息",name = "json",required = true) OrganizationTypeCode organizationTypeCode)throws Exception{
        if(StringUtils.isNotEmpty(organizationTypeCode.getId())){
            log.info("---修改机构类型数据---");
            organizationTypeCodeService.update(organizationTypeCode);
            return CommonResult.success().setMsg("修改成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_IS_NULL).setMsg("机构类型的编号不能为空");
    }

    /**
     * @Description 分页查询
     * @param pageNum 当前页
     * @param pageSize 每页展示数据
     * @return CommonResult
     **/
    @GetMapping("/get/page")
    @ApiOperation(value = "分页",notes = "分页查询机构类型数据")
    @ApiImplicitParams({@ApiImplicitParam(value = "当前页",name = "pageNum",dataType = "Integer",paramType = "query",defaultValue = "1"),
    @ApiImplicitParam(value = "每页展示数据",name = "pageSize",dataType = "Integer",paramType = "query")})
    public CommonResult getPage(@RequestParam(value = "pageNum",defaultValue = "1",required = false)Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "10",required = false)Integer pageSize)throws Exception{
        PageHelper.startPage(pageNum,pageSize);
        List<OrganizationTypeCode> organizationTypeCodes = organizationTypeCodeService.getAll();
        PageInfo<OrganizationTypeCode> list = new PageInfo<>(organizationTypeCodes);
        return CommonResult.success().setMsg("查询成功").addResult("list",list);
    }

    /**
     * @Description 启用禁用
     * @Date 14:07 2019/11/6
     * @Param [id] 编号
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping("/hidden/{id}")
    @ApiOperation(value = "禁用/启用",notes = "禁用/启用机构类型信息")
    public CommonResult hiddenById(@PathVariable String id)throws Exception{
        if(StringUtils.isNotEmpty(id)){
            log.info("---修改编号为"+id+"的应用状态---");
            //TODO 增加一个启用禁用的方法
//            postInfoService.hiddenById(id);
            return CommonResult.success().setMsg("修改状态成功");
        }
        return CommonResult.failed(MessageCodeEnum.PARAMETER_NOT_VALID).setMsg("机构类型编号不能为空");
    }

    /**
     * @Description 启用禁用
     * @Date 14:07 2019/11/6
     * @param id 机构类型的编号
     * @return com.example.manager.base.CommonResult
     **/
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除",notes = "删除机构类型信息")
    public CommonResult delete(@PathVariable String id)throws Exception{
        log.info("---查询机构类型编号为"+id+"的机构信息数据");
        List<Organization> organizations = organizationService.getByTypeCode(id);
        if(organizations != null && organizations.size() > 0){
            return CommonResult.fail().setMsg("该类型下还有所属机构，请先解除关联，再进行操作");
        }
        organizationTypeCodeService.deleteById(id);
        return CommonResult.success().setMsg("删除成功");
    }

}
