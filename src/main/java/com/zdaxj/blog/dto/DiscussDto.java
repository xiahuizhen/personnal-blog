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
 * @TableName tbdiscuss
 */
@Data
@EqualsAndHashCode
public class DiscussDto implements Serializable {
    /**
     * 评论主键
     */
    private Integer id;

    /**
     * 博客id
     */
    private Integer blogId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 上级留言id
     */
    private Integer parentId;

    /**
     * 评论时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}