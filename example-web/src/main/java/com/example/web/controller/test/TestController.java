package com.example.web.controller.test;

import com.example.common.api.ApiResult;

import com.example.system.service.UserService;
import com.example.web.controller.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试控制器
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/21 16:53
 */
@RestController
public class TestController extends BaseController {

    @Resource
    UserService userService;

    /**
     * 测试方法
     *
     * @date  20:53 2019/8/21
     **/
    @RequestMapping("/hello")
    public ApiResult hello() {
        return ApiResult.ok(userService.list());
    }

}
