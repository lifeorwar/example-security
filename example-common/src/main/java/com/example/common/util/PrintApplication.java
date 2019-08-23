package com.example.common.util;

import lombok.extern.slf4j.Slf4j;
import org.fusesource.jansi.Ansi;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 打印项目信息
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/22 10:00
 */
@Slf4j
public class PrintApplication {

    /**
     * 启动成功之后，打印项目信息
     */
    public static void print(ConfigurableApplicationContext context){
        ConfigurableEnvironment environment = context.getEnvironment();
        // 项目名称
        String projectFinalName = environment.getProperty("info.project-final-name");
        // 项目版本
        String projectVersion = environment.getProperty("info.project-version");
        // 项目profile
        String profileActive = environment.getProperty("spring.profiles.active");
        // 项目路径
        String contextPath = environment.getProperty("server.servlet.context-path");
        // 项目端口
        String port = environment.getProperty("server.port");

        log.info("ProfileActive    ：{}",profileActive);
        log.info("ContextPath      ：{}",contextPath);
        log.info("Port             ：{}",port);
        log.info("ProjectName      ：{}",projectFinalName);
        log.info("ProjectVersion   ：{}",projectVersion);

        String startSuccess = "  ________ __   ____  ____  ____   ______ ______\n" +
                " /  ___/  |  \\_/ ___\\/ ___\\/ __ \\ /  ___//  ___/\n" +
                " \\___ \\|  |  /\\  \\__\\  \\__\\  ___/ \\___ \\ \\___ \\ \n" +
                "/____  >____/  \\___  >___  >___  >____  >____  >\n" +
                "     \\/            \\/    \\/    \\/     \\/     \\/ ";

        // String homeUrl = "http://" + IpUtil.getLocalhostIp() + ":" + port + contextPath;
        String homeUrl = "http://127.0.0.1:" + port + contextPath;
        // String swaggerUrl = "http://" + IpUtil.getLocalhostIp() + ":" + port + contextPath + "docs";
        String swaggerUrl = "http://127.0.0.1:" + port + contextPath + "docs";
        log.info("ProjectHome      ：{}",homeUrl);
        log.info("ProjectDocs      ：{}",swaggerUrl);
        log.info("Example Project Start Success...........");
        log.info("\n{}",AnsiUtil.getAnsi(Ansi.Color.GREEN,startSuccess));
    }

}
