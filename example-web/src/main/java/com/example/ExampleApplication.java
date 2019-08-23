package com.example;

import com.example.common.util.PrintApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动入口类
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/21 16:27
 */
@SpringBootApplication()
@EnableConfigurationProperties()
@EnableCaching
@EnableAsync
@EnableTransactionManagement
@MapperScan({"com.example.**.mapper"})
public class ExampleApplication {

    public static void main(String[] args) {
        PrintApplication.print(SpringApplication.run(ExampleApplication.class, args));
    }

}
