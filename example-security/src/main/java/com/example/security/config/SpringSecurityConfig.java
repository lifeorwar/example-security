package com.example.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

/**
 * SpringSecurity 权限配置中心
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/23 11:03
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().permitAll() // 全部路径放行
                .and()
                .csrf() .disable()  // 禁用自带的跨域处理
                .sessionManagement()  // 定制我们自己的会话策略
                // 调整为不创建和使用会话
                .sessionCreationPolicy(STATELESS);
    }

}
