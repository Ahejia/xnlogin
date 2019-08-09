package com.example.xnlogin.mess;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author hejia
 * @Classname TimeTask
 * @Date 2019/8/9 0009 14:53
 */
@Component
public class TimeTask implements ApplicationRunner {

    @Autowired
    private UserGradeService userGradeService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        startDeleteImgService();//
    }

    //定时器
    public void startDeleteImgService() throws Exception{
        System.out.println("启动删除＝＝＝＝");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 0);
        Date time = calendar.getTime();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(
                1, new BasicThreadFactory.Builder().namingPattern("schedule-pool-%d").daemon(false).build());
        // 第一个参数是任务，第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间,第四个参数是时间单位
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    userGradeService.deleteMessage();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0L,1, TimeUnit.DAYS);
    }     //执行时间     间隔时间


    private void useScheduledThreadPoolExecutorImplTimedTask()throws Exception{
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(
                1, new BasicThreadFactory.Builder().namingPattern("schedule-pool-%d").daemon(false).build());
        // 第一个参数是任务，第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间,第四个参数是时间单位
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    userGradeService.deleteMessage();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Local Time is " + new Date().toString());
            }
        }, 0L,1, TimeUnit.DAYS);
    }
}
