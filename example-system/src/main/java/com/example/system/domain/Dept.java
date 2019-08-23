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

@ApiModel(value="com.example.system.domain.Dept")
@Getter
@Setter
@ToString
@TableName(value = "t_dept")
public class Dept extends BaseDomain {
    /**
     * 部门ID
     */
    @TableId(value = "DEPT_ID", type = IdType.AUTO)
    @ApiModelProperty(value="部门ID")
    private Long deptId;

    /**
     * 上级部门ID
     */
    @TableField(value = "PARENT_ID")
    @ApiModelProperty(value="上级部门ID")
    private Long parentId;

    /**
     * 部门名称
     */
    @TableField(value = "DEPT_NAME")
    @ApiModelProperty(value="部门名称")
    private String deptName;

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
}