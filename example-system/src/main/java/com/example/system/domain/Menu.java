package com.example.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.domain.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(value="com.example.system.domain.Menu")
@Getter
@Setter
@ToString
@TableName(value = "t_menu")
public class Menu extends BaseDomain {
    /**
     * 菜单/按钮ID
     */
    @TableId(value = "MENU_ID", type = IdType.AUTO)
    @ApiModelProperty(value="菜单/按钮ID")
    private Long menuId;

    /**
     * 上级菜单ID
     */
    @TableField(value = "PARENT_ID")
    @ApiModelProperty(value="上级菜单ID")
    private Long parentId;

    /**
     * 菜单/按钮名称
     */
    @TableField(value = "MENU_NAME")
    @ApiModelProperty(value="菜单/按钮名称")
    private String menuName;

    /**
     * 菜单URL
     */
    @TableField(value = "URL")
    @ApiModelProperty(value="菜单URL")
    private String url;

    /**
     * 权限标识
     */
    @TableField(value = "PERMS")
    @ApiModelProperty(value="权限标识")
    private String perms;

    /**
     * 图标
     */
    @TableField(value = "ICON")
    @ApiModelProperty(value="图标")
    private String icon;

    /**
     * 类型 0菜单 1按钮
     */
    @TableField(value = "TYPE")
    @ApiModelProperty(value="类型 0菜单 1按钮")
    private String type;

    /**
     * 排序
     */
    @TableField(value = "ORDER_NUM")
    @ApiModelProperty(value="排序")
    private Long orderNum;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "MODIFY_TIME")
    @ApiModelProperty(value="修改时间")
    private Date modifyTime;
}