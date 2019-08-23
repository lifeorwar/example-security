package com.example.common.config.core;

import com.example.common.aop.LogAop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 项目配置
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/23 9:44
 */
@Slf4j
@Configuration
@EnableConfigurationProperties({ProjectProperties.class})
public class ProjectConfig {

    /**
     * 配置日志AOP
     *
     * @param properties    配置文件
     * @return  LogApo
     */
    @Bean
    public LogAop logAop(ProjectProperties properties){
        LogAop logAop = new LogAop();
        logAop.setRequestLogFormat(properties.isRequestLogFormat());
        logAop.setResponseLogFormat(properties.isResponseLogFormat());
        log.info("InIt LogAop Success...");
        return logAop;
    }

}
