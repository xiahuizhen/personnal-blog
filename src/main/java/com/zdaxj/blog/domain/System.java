package com.zdaxj.blog.domain;

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
@TableName(value ="tbsystem")
@Data
@EqualsAndHashCode
public class System implements Serializable {
    /**
     * 系统主键
     */
    @TableId
    private Integer id;

    /**
     * 版本
     */
    private String version;

    /**
     * 创建时间
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}