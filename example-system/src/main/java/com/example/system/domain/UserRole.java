package com.example.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.domain.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(value="com.example.system.domain.UserRole")
@Getter
@Setter
@ToString
@TableName(value = "t_user_role")
public class UserRole extends BaseDomain {
    /**
     * 用户ID
     */
    @TableField(value = "USER_ID")
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
     * 角色ID
     */
    @TableField(value = "ROLE_ID")
    @ApiModelProperty(value="角色ID")
    private Long roleId;
}