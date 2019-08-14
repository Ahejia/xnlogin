package com.example.xnlogin.mess;

import com.example.xnlogin.mapper.UserGradeMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hejia
 * @Classname UserGradeService
 * @Date 2019/8/9 0009 13:48
 */
@Service
public class UserGradeService {
    private Logger logger = LoggerFactory.getLogger(UserGradeService.class);
    @Autowired
    private UserGradeMapper userGradeMapper;

    /**
     * @describe   用户编号查询数据信息
     * @param userId 学号
     * @param timer 时间
     * @return java.util.List<com.example.xnlogin.mess.UserGrade>
     */
    public List<UserGrade> getByUserIdAndTimer(Long userId,String timer) throws Exception{
        List<UserGrade> userGrades = new ArrayList<>();
        if(StringUtils.isEmpty(timer)){
            logger.info("---查询不同的时间---");
            List<String> timers = userGradeMapper.getTimerByUserId(userId);
            if(timers != null && timers.size() > 0){
                for(String string : timers){
                    Long id = userGradeMapper.getLastMessageId(userId, string);
                    UserGrade userGrade = userGradeMapper.getUserGradeById(id);
                    userGrades.add(userGrade);
                }
            }
            return userGrades;
        }
        logger.info("---查询学生编号为"+userId+"在"+timer+"的成绩信息---");
        Long id = userGradeMapper.getLastMessageId(userId, timer);
        UserGrade userGrade = userGradeMapper.getById(id);
        if(userGrade != null){
            userGrades.add(userGrade);
        }
        return userGrades;


    }

    public void save(String userId,String score, String dataInfo,String operateType,String timer)throws Exception{
        UserGrade userGrade = new UserGrade();
        userGrade.setUserId(Long.valueOf(userId));
        userGrade.setDatainfo(dataInfo);
        userGrade.setOperateType(operateType);
        userGrade.setScore(Integer.parseInt(score));
        userGrade.setTimer(timer);
        userGradeMapper.insert(userGrade);
    }

    /**
     * 定时任务
     * 删除存储时间超过30天的数据
     */
    public void deleteMessage() throws Exception {
        logger.info("---查询时间超过30天的数据并删除---");
        List<Long> surplus = userGradeMapper.getSurplus();
        if (surplus.size() > 0 && surplus != null) {
            for (int i = 0; i < surplus.size(); i++) {
                userGradeMapper.deleteById(surplus.get(i));
                logger.info("---删除编号为"+surplus.get(i)+"的数据信息---");
            }
        }
    }
}
