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

@ApiModel(value="com.example.system.domain.Log")
@Getter
@Setter
@ToString
@TableName(value = "t_log")
public class Log extends BaseDomain {
    /**
     * 日志ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    @ApiModelProperty(value="日志ID")
    private Long id;

    /**
     * 操作用户
     */
    @TableField(value = "USERNAME")
    @ApiModelProperty(value="操作用户")
    private String username;

    /**
     * 操作内容
     */
    @TableField(value = "OPERATION")
    @ApiModelProperty(value="操作内容")
    private String operation;

    /**
     * 耗时
     */
    @TableField(value = "TIME")
    @ApiModelProperty(value="耗时")
    private Long time;

    /**
     * 操作方法
     */
    @TableField(value = "METHOD")
    @ApiModelProperty(value="操作方法")
    private String method;

    /**
     * 方法参数
     */
    @TableField(value = "PARAMS")
    @ApiModelProperty(value="方法参数")
    private String params;

    /**
     * 操作者IP
     */
    @TableField(value = "IP")
    @ApiModelProperty(value="操作者IP")
    private String ip;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 操作地点
     */
    @TableField(value = "location")
    @ApiModelProperty(value="操作地点")
    private String location;
}