package com.example.common.config.core;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * 项目属性配置信息
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/23 9:44
 */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = "config")
public class ProjectProperties {

    /**
     * 是否启用ansi控制台输出有颜色的字体，local环境建议开启，服务器环境设置为false
     */
    private boolean enableAnsi;

    /**
     * 请求日志在控制台是否格式化输出，local环境建议开启，服务器环境设置为false
     */
    private boolean requestLogFormat;

    /**
     * 响应日志在控制台是否格式化输出，local环境建议开启，服务器环境设置为false
     */
    private boolean responseLogFormat;

    /**
     * 登录token失效时间，单位分钟，默认60分钟失效
     */
    private Integer tokenValidTime = 60;

}
