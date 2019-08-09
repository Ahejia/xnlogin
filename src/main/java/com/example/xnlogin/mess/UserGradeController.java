package com.example.xnlogin.mess;

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

    @Autowired
    private UserGradeService userGradeService;
    @PostMapping("/grade/getByCondition")
    public CommonResult getByCondition(@RequestParam(value = "userId",required = false)String userId,
                                       @RequestParam(value = "timer",required = false)String timer)throws Exception{
        if(userId != null){
            List<UserGrade> userGrades = userGradeService.getByUserIdAndTimer(Long.valueOf(userId), timer);
            return CommonResult.success().addResult("userGrades",userGrades);
        }
        List<UserGrade> userGrades = userGradeService.getByUserIdAndTimer(null, timer);
        return CommonResult.success().addResult("userGrades",userGrades);
    }

    @PostMapping("grade/add")
    public CommonResult add(@RequestParam(value = "userId",required = false)String userId,
                            @RequestParam(value = "dataInfo",required = false)String dataInfo,
                            @RequestParam(value = "score",required = false)String score,
                            @RequestParam(value = "timer",required = false)String timer)throws Exception{
        if(StringUtils.isEmpty(userId)){
            return CommonResult.fail().setMsg("学生编号不能为空");
        }
        logger.info("---保存学生成绩信息---");
        userGradeService.save(userId,dataInfo,score,timer);
        return CommonResult.success().setMsg("保存成功");
    }
}
