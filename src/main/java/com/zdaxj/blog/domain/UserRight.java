package com.zdaxj.blog.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 
 * @TableName tbuserright
 */
@TableName(value ="tbuserright")
@Data
@EqualsAndHashCode
public class UserRight implements Serializable {
    /**
     * 权限主键
     */
    @TableId
    private Integer id;

    /**
     * 用户id
     */
    @TableId
    private Integer userId;

    /**
     * 权限类型
     */
    @TableId
    private String rightType;

    /**
     * 是否拥有权限
     */
    private String isAllow;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}