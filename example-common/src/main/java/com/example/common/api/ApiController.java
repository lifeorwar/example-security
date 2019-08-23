package com.example.common.api;

import lombok.extern.slf4j.Slf4j;

/**
 * ApiResultEST API 公共控制器
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/22 10:00
 */
@Slf4j
public class ApiController {

    /**
     * <p>
     * 请求成功
     * </p>
     *
     * @param data 数据内容
     * @param <T>  对象泛型
     * @return
     */
    protected <T> ApiResult<T> ok(T data) {
        return ApiResult.ok(data);
    }

    /**
     * <p>
     * 请求失败
     * </p>
     *
     * @param msg 提示内容
     * @return
     */
    protected ApiResult<Object> fail(String msg) {
        return ApiResult.fail(msg);
    }

    /**
     * <p>
     * 请求失败
     * </p>
     *
     * @param apiCode 请求错误码
     * @return
     */
    protected ApiResult<Object> fail(ApiCode apiCode) {
        return ApiResult.fail(apiCode);
    }

}
