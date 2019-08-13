package com.example.xnlogin.mess;

import com.alibaba.fastjson.JSONObject;
import com.example.xnlogin.base.BaseController;
import com.example.xnlogin.base.CommonResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author hejia
 * @Classname UserGradeController
 * @Date 2019/8/9 0009 13:48
 */
@RestController
public class UserGradeController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(UserGradeController.class);
    /**
     * @describe 查询
     * @param userId 用户编号
     * @param timer 时间
     * @return
     */
    @Autowired
    private UserGradeService userGradeService;
    @Autowired
    private UserService userService;
    @PostMapping("/grade/getByCondition")
    public CommonResult getByCondition(@RequestParam(value = "userId",required = false)String userId,
                                       @RequestParam(value = "timer",required = false)String timer)throws Exception{
        if(userId == null){
            return CommonResult.fail().setMsg("y用户编号不能为空");
        }
        String userName = userService.getUserNameById(Long.valueOf(userId));
        List<UserGrade> userGrades = userGradeService.getByUserIdAndTimer(Long.valueOf(userId), timer);
        return CommonResult.success().addResult("userGrades",userGrades).addResult("userName",userName);
    }
    /**
     * @describe 添加信息
     * @param userId 学生编号
     * @param operateInfo 成绩详情
     * @param totalScore 总分
     * @param operateDate 时间
     * @return com.example.xnlogin.base.CommonResult
     */
    @PostMapping("grade/add")
    public CommonResult add(@RequestParam(value = "userId",required = false)String userId,
                            @RequestParam(value = "operateInfo",required = false)String operateInfo,
                            @RequestParam(value = "totalScore",required = false)String totalScore,
                            @RequestParam(value = "operateDate",required = false)String operateDate)throws Exception{
        if(StringUtils.isEmpty(userId)){
            return CommonResult.fail().setMsg("学生编号不能为空");
        }
        logger.info("---保存学生成绩信息---");
        userGradeService.save(userId,totalScore,operateInfo,operateDate);
        return CommonResult.success().setMsg("保存成功");
    }
}
