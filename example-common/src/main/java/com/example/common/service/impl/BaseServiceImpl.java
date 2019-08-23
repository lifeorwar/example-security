package com.example.common.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.service.BaseService;
import com.example.common.web.param.BaseOrderQueryParam;
import com.example.common.web.param.BaseQueryParam;
import org.apache.commons.collections.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * 业务父类实现
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/22 11:04
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

    protected Page setPageParam(BaseQueryParam baseQueryParam) {
        return setPageParam(baseQueryParam,null);
    }

    protected Page setPageParam(BaseQueryParam baseQueryParam, OrderItem defaultOrder) {
        Page page = new Page();
        // 设置当前页码
        page.setCurrent(baseQueryParam.getCurrent());
        // 设置页大小
        page.setSize(baseQueryParam.getSize());
        /*
         * 如果是queryParam是OrderQueryParam，并且不为空，则使用前端排序
         * 否则使用默认排序
         */
        if (baseQueryParam instanceof BaseOrderQueryParam){
            BaseOrderQueryParam orderQueryParam = (BaseOrderQueryParam) baseQueryParam;
            List<OrderItem> orderItems = orderQueryParam.getOrders();
            if (CollectionUtils.isEmpty(orderItems)){
                page.setOrders(Arrays.asList(defaultOrder));
            }else{
                page.setOrders(orderItems);
            }
        }else{
            page.setOrders(Arrays.asList(defaultOrder));
        }

        return page;
    }

}
