package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 功能名：管理应用信息
 * 数据表：app_info
 * 表备注：存储应用的相关信息，包括应用名称、当前服务器、创建时间、修改时间和密码。
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("app_info")
public class AppInfoEntity extends InfraBaseEntity {
    // fields
    /**
     * 应用名称
     */
    @TableField("app_name")
    private String appName;

    /**
     * 当前服务器
     */
    @TableField("current_server")
    private String currentServer;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @TableField("gmt_modified")
    private Date gmtModified;

    /**
     * 密码
     */
    @TableField("password")
    private String password;
    
    // getter and setter
    public String getAppName(){
        return this.appName;
    }
    public AppInfoEntity setAppName(String arg){
        this.appName = arg;
        return this;
    }
    public String getCurrentServer(){
        return this.currentServer;
    }
    public AppInfoEntity setCurrentServer(String arg){
        this.currentServer = arg;
        return this;
    }
    public Date getGmtCreate(){
        return this.gmtCreate;
    }
    public AppInfoEntity setGmtCreate(Date arg){
        this.gmtCreate = arg;
        return this;
    }
    public Date getGmtModified(){
        return this.gmtModified;
    }
    public AppInfoEntity setGmtModified(Date arg){
        this.gmtModified = arg;
        return this;
    }
    public String getPassword(){
        return this.password;
    }
    public AppInfoEntity setPassword(String arg){
        this.password = arg;
        return this;
    }
}
