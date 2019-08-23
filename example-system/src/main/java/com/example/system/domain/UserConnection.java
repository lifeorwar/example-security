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

@ApiModel(value="com.example.system.domain.UserConnection")
@Getter
@Setter
@ToString
@TableName(value = "t_user_connection")
public class UserConnection extends BaseDomain {
    @TableId(value = "userId", type = IdType.INPUT)
    @ApiModelProperty(value="null")
    private String userid;

    @TableId(value = "providerId", type = IdType.INPUT)
    @ApiModelProperty(value="null")
    private String providerid;

    @TableId(value = "providerUserId", type = IdType.INPUT)
    @ApiModelProperty(value="null")
    private String provideruserid;

    @TableField(value = "rank")
    @ApiModelProperty(value="null")
    private Integer rank;

    @TableField(value = "displayName")
    @ApiModelProperty(value="null")
    private String displayname;

    @TableField(value = "profileUrl")
    @ApiModelProperty(value="null")
    private String profileurl;

    @TableField(value = "imageUrl")
    @ApiModelProperty(value="null")
    private String imageurl;

    @TableField(value = "accessToken")
    @ApiModelProperty(value="null")
    private String accesstoken;

    @TableField(value = "secret")
    @ApiModelProperty(value="null")
    private String secret;

    @TableField(value = "refreshToken")
    @ApiModelProperty(value="null")
    private String refreshtoken;

    @TableField(value = "expireTime")
    @ApiModelProperty(value="null")
    private Long expiretime;
}