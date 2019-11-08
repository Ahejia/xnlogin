package com.example.manager.controller;

import com.example.manager.base.BaseController;
import com.example.manager.base.CommonResult;
import com.example.manager.enums.MessageCodeEnum;
import com.example.manager.pojo.Organization;
import com.example.manager.pojo.OrganizationPost;
import com.example.manager.service.IOrganizationService;
import com.example.manager.until.DozerUtil;
import com.example.manager.vo.OrganizationVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hj
 * @Description: 机构信息
 * @Date:Create：in 2019/11/6 11:51
 */
@RestController
@RequestMapping("/organization")
@Api("OrganizationController")
public class OrganizationController extends BaseController {

    private Logger log = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private IOrganizationService organizationService;

    @PostMapping("/save")
    @ApiOperation(value = "保存",notes = "保存机构信息")
    public CommonResult save(@RequestBody @ApiParam(name = "应用信息对象",value = "json",required = true)
                                         List<OrganizationVo> organizationVos)throws Exception{
        List<OrganizationVo> list = new ArrayList<>();
        if(organizationVos != null){
            for(OrganizationVo organizationVo : organizationVos){
                if(StringUtils.isNotEmpty(organizationVo.getPostId())){
                    list.add(organizationVo);
                }
            }
            if(list.size() > 0){
                for(OrganizationVo organizationVo : list){
                    Organization organization = DozerUtil.one2one(organizationVo, Organization.class);
                    organizationService.save(organization);
                    //岗位信息到机构岗位关联表中
                    OrganizationPost organizationPost = DozerUtil.one2one(organizationVo, OrganizationPost.class);
                    organizationPost.setOrganizationId(organization.getId());
                    organizationService.saveOrganizationPost(organizationPost);
                }
                return CommonResult.success().setMsg("保存成功");
            }
            return CommonResult.fail().setMsg("岗位编号不能为空");
        }
        return CommonResult.fail().setMsg("机构数据不能为空");
    }

    /**
     * @Description 分页查询
     * @Date 12:39 2019/11/7
     * @return com.example.manager.base.CommonResult
    **/
    @GetMapping("/get/page")
    @ApiOperation(value = "分页",notes = "分页查询机构信息数据")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageSize", value = "当前页",required = false,defaultValue = "1",dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "每页展示数量",required = false,defaultValue = "10",dataType = "Integer",paramType = "query")})
    public CommonResult getPage(@RequestParam(value = "pageNum",defaultValue = "1",required = false)Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "10",required = false)Integer pageSize)throws Exception{
        log.info("---分页查询数据信息---");
        PageHelper.startPage(pageNum, pageSize);
        List<Organization> organizations = organizationService.getAll();
        PageInfo<Organization> list = new PageInfo<>(organizations);
        return CommonResult.success().setMsg("查询成功").addResult("list",list);
    }
    @ApiOperation("启用/禁用")
    @PostMapping("hidden/by/{id}")
    public CommonResult hiddenById(@PathVariable String id)throws Exception{
        if(StringUtils.isEmpty(id)){
            return CommonResult.failed(MessageCodeEnum.PARAMETER_IS_NULL).setMsg("编号不能为空");
        }
        log.info("---修改编号为"+id+"的状态信息---");
        //禁用启用逻辑 TODO

        return CommonResult.success().setMsg("修改状态成功");
    }
}
