package com.perfect.mall.mallsys.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Verifycode implements Serializable {

    private Long id;

    /**
     * 验证码类型
     */
    private Integer codeType;

    /**
     * 验证码
     */
    private String codeNumber;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 接收端(手机号码，邮箱)
     */
    private String receiver;


}
