package com.alinesno.infra.plat.security.entity;

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
public class SecurityServiceEntity extends InfraBaseEntity {

    // fields

    /**
     * 服务名称
     */
    @TableField("service_name")
    private String serviceName;

    /**
     * 服务标识
     */
    @TableField("service_identifier")
    private String serviceIdentifier;

    /**
     * 应用名称
     */
    @TableField("app_name")
    private String appName;

    /**
     * 应用状态
     */
    @TableField("app_status")
    private String appStatus;

    /**
     * 应用运行状态
     */
    @TableField("app_running_status")
    private String appRunningStatus;

    /**
     * 异常数
     */
    @TableField("exception_count")
    private String exceptionCount;

    /**
     * 风险数
     */
    @TableField("risk_count")
    private String riskCount;

    // getter and setter methods

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getAppRunningStatus() {
        return appRunningStatus;
    }

    public void setAppRunningStatus(String appRunningStatus) {
        this.appRunningStatus = appRunningStatus;
    }

    public String getExceptionCount() {
        return exceptionCount;
    }

    public void setExceptionCount(String exceptionCount) {
        this.exceptionCount = exceptionCount;
    }

    public String getRiskCount() {
        return riskCount;
    }

    public void setRiskCount(String riskCount) {
        this.riskCount = riskCount;
    }
}
