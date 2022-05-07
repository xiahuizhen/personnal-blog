package com.zdaxj.blog.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 
 * @TableName tbblogtext
 */
@TableName(value ="tbblogtext")
@Data
@EqualsAndHashCode
public class BlogText implements Serializable {
    /**
     * 博客内容主键
     */
    @TableId
    private Integer id;

    /**
     * 博客内容
     */
    private String text;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}