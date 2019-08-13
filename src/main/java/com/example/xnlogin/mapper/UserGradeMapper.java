package com.example.xnlogin.mapper;

import com.example.xnlogin.base.IBaseDao;
import com.example.xnlogin.mess.UserGrade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserGradeMapper extends IBaseDao<UserGrade> {

    /**
     * 用户编号与时间查询数据
     */
    List<UserGrade> getByUserIdAndTimer(@Param("userId") Long userId, @Param("timer") String timer);

    /**
     * id查询，不查询dataIdfo的数据
     */
    UserGrade getUserGradeById(Long id);

    /**
     * 用户编号查询不同的日期
     */
    List<String> getTimerByUserId(Long userId);

    /**
     * 用户编号与时间查询最后一条数据
     */
    Long getLastMessageId(@Param("userId") Long userId, @Param("timer") String timer);

    /**
     * 查询超过30天的数据
     */
    List<Long> getSurplus();

}