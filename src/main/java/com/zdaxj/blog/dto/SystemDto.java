package com.zdaxj.blog.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName tbsystem
 */
@Data
@EqualsAndHashCode
public class SystemDto implements Serializable {
    /**
     * 系统主键
     */
    private Integer id;

    /**
     * 版本
     */
    private String version;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}