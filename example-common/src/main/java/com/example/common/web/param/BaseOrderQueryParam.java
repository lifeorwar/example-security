package com.example.common.web.param;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.collections.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * 可排序查询参数对象
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/22 11:04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("可排序查询参数对象")
public abstract class BaseOrderQueryParam extends BaseQueryParam {
    private static final long serialVersionUID = 57714391204790143L;

    @ApiModelProperty(value = "排序")
    private List<OrderItem> orders;

    public void defaultOrder(OrderItem orderItem){
        this.defaultOrders(Arrays.asList(orderItem));
    }

    public void defaultOrders(List<OrderItem> orderItems){
        if (CollectionUtils.isEmpty(orderItems)){
            return;
        }
        this.orders = orderItems;
    }

}
