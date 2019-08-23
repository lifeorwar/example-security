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

@ApiModel(value="com.example.system.domain.RoleMenu")
@Getter
@Setter
@ToString
@TableName(value = "t_role_menu")
public class RoleMenu extends BaseDomain {
    /**
     * 角色ID
     */
    @TableField(value = "ROLE_ID")
    @ApiModelProperty(value="角色ID")
    private Long roleId;

    /**
     * 菜单/按钮ID
     */
    @TableField(value = "MENU_ID")
    @ApiModelProperty(value="菜单/按钮ID")
    private Long menuId;
}