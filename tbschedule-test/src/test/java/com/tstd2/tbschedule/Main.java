package com.tstd2.tbschedule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    /**
     * 本想为大家演示脱离Spring的纯java使用tbs，但由于其注册中心
     * 需利用反射在spring容器注册的bean中获取需要调度的Bean
     * 故此处声明Spring容器的作用只在于将job firstScheduleDemo
     * 注入容器，并把容器交由tbs调度器管理。
     *
     * @param args
     */
    public static void main(String... args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

//        //实例化一个调度器
//        TBScheduleManagerFactory tbScheduleManagerFactory = TBScheduleFactory.getTbsFactory(
//                "10.10.40.27:2181,10.10.40.27:2181,10.10.40.27:2181",
//                "/taobao-pamirs-schedule/huijin",
//                "60000",
//                "ScheduleAdmin",
//                "password");
//
//        //Spring容器交由tbs调度器管理
//        tbScheduleManagerFactory.setApplicationContext(context);

        while (true){

        }
    }
}
