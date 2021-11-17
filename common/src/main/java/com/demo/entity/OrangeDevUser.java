package com.demo.entity;

import lombok.Data;

/**
*
* @description TODO
*
* @author: Administrator
*
* @create: 2021-11-16 20:45:08
*
**/
@Data
public class OrangeDevUser {
    /**
    * user主键id，自增
    */
    private Integer userid;

    /**
    * 用户名称
    */
    private String username;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 用户电话号码
    */
    private String mobilephone;

    /**
    * 用户邮箱地址（可以为空）
    */
    private String email;

    /**
    * 用户类型（1-开发者，2-普通用户，3-IOTadmin，4-nurseadmin）
    */
    private String usertype;

    /**
    * 用户注册时所代表的公司（小米，格力）
    */
    private Integer companyid;

    /**
    * 用户头像路径
    */
    private String userphoto;

    /**
    * 用户登录客户端平台（web，android，ios）
    */
    private String userclient;

    /**
    * 用户最后登录时间
    */
    private String lastlogin;

    /**
    * 是否已经注册（0已注册，1未注册）
    */
    private Integer isregister;

    /**
    * 公司名称(默认手机号)
    */
    private String company;

    /**
    * 手机设备唯一标识
    */
    private String remark1;

    /**
    * accestoken不同手机登录凭证
    */
    private String remark2;

    private String remark3;

    private String remark4;

    /**
    * 系统预留字段
    */
    private String remark5;

    /**
    * 用户注册时间
    */
    private String createtime;

    /**
    * 用户昵称（默认手机号）
    */
    private String nickname;

    /**
    * 用户地址
    */
    private String useraddress;

    /**
    * 是否首次登陆（0否，1是）
    */
    private Integer firstlogin;

    /**
    * 是否禁言（0-是 1-否）
    */
    private Integer ismute;

    /**
    * 城市
    */
    private String city;

    /**
    * 是否禁用（0-是，1-否，默认否）
    */
    private Integer disabled;
}
