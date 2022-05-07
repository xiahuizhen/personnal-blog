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
 * @TableName tbblog
 */
@TableName(value ="tbblog")
@Data
@EqualsAndHashCode
public class Blog implements Serializable {
    /**
     * 博客主键
     */
    @TableId
    private Integer id;

    /**
     * 作者id, 多个用,分割
     */
    private String writer;

    /**
     * 博客内容id
     */
    private Integer textId;

    /**
     * 阅读次数
     */
    private Integer readTimes;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date lastModifyTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}