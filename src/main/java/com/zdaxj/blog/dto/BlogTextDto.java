package com.zdaxj.blog.dto;

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
@Data
@EqualsAndHashCode
public class BlogTextDto implements Serializable {
    /**
     * 博客内容主键
     */
    private Integer id;

    /**
     * 博客内容
     */
    private String text;

    private static final long serialVersionUID = 1L;
}