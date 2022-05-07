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
 * @TableName tbuser
 */
@Data
@EqualsAndHashCode
public class UserDto implements Serializable {
    /**
     * 用户主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户姓名
     */
    private String realName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 手机号
     */
    private Integer mobile;

    /**
     * 性别
     */
    private String sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 城市
     */
    private String city;

    /**
     * 最后登录时间
     */
    private Date lastLogonTime;

    private static final long serialVersionUID = 1L;
}