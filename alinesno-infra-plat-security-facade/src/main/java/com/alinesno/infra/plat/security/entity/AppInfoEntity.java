package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class AppInfoEntity extends InfraBaseEntity {
    // fields
    /**
     * 应用名称
     */
    @TableField("app_name")
	@ColumnType(length=50)
	@ColumnComment("应用名称")
    private String appName;

    /**
     * 当前服务器
     */
    @TableField("current_server")
	@ColumnType(length=255)
	@ColumnComment("当前服务器")
    private String currentServer;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
	@ColumnType(length=19)
	@ColumnComment("创建时间")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @TableField("gmt_modified")
	@ColumnType(length=19)
	@ColumnComment("修改时间")
    private Date gmtModified;

    /**
     * 密码
     */
    @TableField("password")
	@ColumnType(length=64)
	@ColumnComment("密码")
    private String password;
}
