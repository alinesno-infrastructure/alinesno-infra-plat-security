package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：容器资产
 * 数据表：security_container
 * 表备注：容器资产表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("security_container")
public class SecurityContainerEntity extends InfraBaseEntity {

    // fields

    /**
     * 容器名称
     */
    @TableField("container_name")
    private String containerName;

    /**
     * 容器标识
     */
    @TableField("container_identifier")
    private String containerIdentifier;

    /**
     * 容器地址名称
     */
    @TableField("container_address_name")
    private String containerAddressName;

    /**
     * 容器状态
     */
    @TableField("container_status")
    private String containerStatus;

    /**
     * 应用运行状态
     */
    @TableField("app_running_status")
    private String appRunningStatus;

    /**
     * 风险数
     */
    @TableField("risk_count")
    private String riskCount;

    /**
     * 高危数
     */
    @TableField("high_risk_count")
    private String highRiskCount;

    // getter and setter methods

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getContainerIdentifier() {
        return containerIdentifier;
    }

    public void setContainerIdentifier(String containerIdentifier) {
        this.containerIdentifier = containerIdentifier;
    }

    public String getContainerAddressName() {
        return containerAddressName;
    }

    public void setContainerAddressName(String containerAddressName) {
        this.containerAddressName = containerAddressName;
    }

    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public String getAppRunningStatus() {
        return appRunningStatus;
    }

    public void setAppRunningStatus(String appRunningStatus) {
        this.appRunningStatus = appRunningStatus;
    }

    public String getRiskCount() {
        return riskCount;
    }

    public void setRiskCount(String riskCount) {
        this.riskCount = riskCount;
    }

    public String getHighRiskCount() {
        return highRiskCount;
    }

    public void setHighRiskCount(String highRiskCount) {
        this.highRiskCount = highRiskCount;
    }
}
