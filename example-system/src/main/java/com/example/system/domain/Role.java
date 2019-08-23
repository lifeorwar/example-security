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

@ApiModel(value="com.example.system.domain.Role")
@Getter
@Setter
@ToString
@TableName(value = "t_role")
public class Role extends BaseDomain {
    /**
     * 角色ID
     */
    @TableId(value = "ROLE_ID", type = IdType.AUTO)
    @ApiModelProperty(value="角色ID")
    private Long roleId;

    /**
     * 角色名称
     */
    @TableField(value = "ROLE_NAME")
    @ApiModelProperty(value="角色名称")
    private String roleName;

    /**
     * 角色描述
     */
    @TableField(value = "REMARK")
    @ApiModelProperty(value="角色描述")
    private String remark;

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