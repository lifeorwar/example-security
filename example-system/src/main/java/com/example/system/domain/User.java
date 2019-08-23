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

@ApiModel(value="com.example.system.domain.User")
@Getter
@Setter
@ToString
@TableName(value = "t_user")
public class User extends BaseDomain {
    /**
     * 用户ID
     */
    @TableId(value = "USER_ID", type = IdType.AUTO)
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
     * 用户名
     */
    @TableField(value = "USERNAME")
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "PASSWORD")
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 部门ID
     */
    @TableField(value = "DEPT_ID")
    @ApiModelProperty(value="部门ID")
    private Long deptId;

    /**
     * 邮箱
     */
    @TableField(value = "EMAIL")
    @ApiModelProperty(value="邮箱")
    private String email;

    /**
     * 联系电话
     */
    @TableField(value = "MOBILE")
    @ApiModelProperty(value="联系电话")
    private String mobile;

    /**
     * 状态 0锁定 1有效
     */
    @TableField(value = "STATUS")
    @ApiModelProperty(value="状态 0锁定 1有效")
    private String status;

    /**
     * 创建时间
     */
    @TableField(value = "CRATE_TIME")
    @ApiModelProperty(value="创建时间")
    private Date crateTime;

    /**
     * 修改时间
     */
    @TableField(value = "MODIFY_TIME")
    @ApiModelProperty(value="修改时间")
    private Date modifyTime;

    /**
     * 最近访问时间
     */
    @TableField(value = "LAST_LOGIN_TIME")
    @ApiModelProperty(value="最近访问时间")
    private Date lastLoginTime;

    /**
     * 性别 0男 1女
     */
    @TableField(value = "SEX")
    @ApiModelProperty(value="性别 0男 1女")
    private String sex;

    /**
     * 主题
     */
    @TableField(value = "THEME")
    @ApiModelProperty(value="主题")
    private String theme;

    /**
     * 头像
     */
    @TableField(value = "AVATAR")
    @ApiModelProperty(value="头像")
    private String avatar;

    /**
     * 描述
     */
    @TableField(value = "DESCRIPTION")
    @ApiModelProperty(value="描述")
    private String description;
}