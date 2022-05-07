package com.zdaxj.blog.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 
 * @TableName tbparam
 */
@Data
@EqualsAndHashCode
public class ParamDto implements Serializable {
    /**
     * 参数主键
     */
    private String id;

    /**
     * 参数值
     */
    private String val;

    /**
     * 参数名
     */
    private String name;

    /**
     * 参数提示
     */
    private String prompt;

    private static final long serialVersionUID = 1L;
}