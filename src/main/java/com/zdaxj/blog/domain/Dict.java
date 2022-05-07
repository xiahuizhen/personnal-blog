package com.zdaxj.blog.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 
 * @TableName tbdict
 */
@TableName(value ="tbdict")
@Data
@EqualsAndHashCode
public class Dict implements Serializable {
    /**
     * 字典主键
     */
    @TableId
    private String id;

    /**
     * 字典具体值
     */
    @TableId
    private String val;

    /**
     * 字典名
     */
    private String name;

    /**
     * 字典提示
     */
    private String prompt;

    /**
     * 是否启用
     */
    private String enableFlag;

    /**
     * 保留字段
     */
    private String reserve1;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}