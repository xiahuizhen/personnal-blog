package com.zdaxj.blog.dto;

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
@Data
@EqualsAndHashCode
public class DictDto implements Serializable {
    /**
     * 字典主键
     */
    private String id;

    /**
     * 字典具体值
     */
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

    private static final long serialVersionUID = 1L;
}