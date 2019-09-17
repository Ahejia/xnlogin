package com.example.xnlogin.mapper;

import com.example.xnlogin.base.IBaseDao;
import com.example.xnlogin.mess.UserGrade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/***
 * @author Administrator
 */
@Mapper
public interface UserGradeMapper extends IBaseDao<UserGrade> {

    /**
     *  id查询，不查询dataIdfo的数据
     * @param id 编号
     * @return com.example.xnlogin.mess.UserGrade
     */
    UserGrade getUserGradeById(Long id);

    /**
     *  用户编号查询不同的日期
     * @param userId 学号
     * @return java.util.List<java.lang.String>
     */
    List<String> getTimerByUserId(Long userId);

    /**
     *
     *  学号与时间查询最后一条数据
     * @param userId 学号
     * @param timer 时间
     * @return java.lang.Long
     */
    Long getLastMessageId(@Param("userId") Long userId, @Param("timer") String timer);
    /**
     * 查询超过30天的数据
     * @return java.util.List<java.lang.Long>
     */
    List<Long> getSurplus();

}