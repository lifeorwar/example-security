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

@ApiModel(value="com.example.system.domain.Dict")
@Getter
@Setter
@ToString
@TableName(value = "t_dict")
public class Dict extends BaseDomain {
    /**
     * 字典ID
     */
    @TableId(value = "DICT_ID", type = IdType.AUTO)
    @ApiModelProperty(value="字典ID")
    private Long dictId;

    /**
     * 键
     */
    @TableField(value = "KEYY")
    @ApiModelProperty(value="键")
    private Long keyy;

    /**
     * 值
     */
    @TableField(value = "VALUEE")
    @ApiModelProperty(value="值")
    private String valuee;

    /**
     * 字段名称
     */
    @TableField(value = "FIELD_NAME")
    @ApiModelProperty(value="字段名称")
    private String fieldName;

    /**
     * 表名
     */
    @TableField(value = "TABLE_NAME")
    @ApiModelProperty(value="表名")
    private String tableName;
}