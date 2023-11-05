package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：服务资产
 * 数据表：security_service
 * 表备注：服务资产表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("security_service")
@Data
public class SecurityServiceEntity extends InfraBaseEntity {

    // fields

    /**
     * 服务名称
     */
    @TableField("service_name")
	@ColumnType(length=255)
	@ColumnComment("服务名称")
    private String serviceName;

    /**
     * 服务标识
     */
    @TableField("service_identifier")
	@ColumnType(length=50)
	@ColumnComment("服务标识")
    private String serviceIdentifier;

    /**
     * 应用名称
     */
    @TableField("app_name")
	@ColumnType(length=50)
	@ColumnComment("应用名称")
    private String appName;

    /**
     * 应用状态
     */
    @TableField("app_status")
	@ColumnType(length=20)
	@ColumnComment("应用状态")
    private String appStatus;

    /**
     * 应用运行状态
     */
    @TableField("app_running_status")
	@ColumnType(length=1)
	@ColumnComment("应用运行状态")
    private String appRunningStatus;

    /**
     * 异常数
     */
    @TableField("exception_count")
	@ColumnType(length=255)
	@ColumnComment("异常数")
    private String exceptionCount;

    /**
     * 风险数
     */
    @TableField("risk_count")
	@ColumnType(length=10)
	@ColumnComment("风险数")
    private String riskCount;
}
