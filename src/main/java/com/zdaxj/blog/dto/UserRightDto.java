package com.zdaxj.blog.dto;

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
@Data
@EqualsAndHashCode
public class UserRightDto implements Serializable {
    /**
     * 权限主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 权限类型
     */
    private String rightType;

    /**
     * 是否拥有权限
     */
    private String isAllow;

    private static final long serialVersionUID = 1L;
}