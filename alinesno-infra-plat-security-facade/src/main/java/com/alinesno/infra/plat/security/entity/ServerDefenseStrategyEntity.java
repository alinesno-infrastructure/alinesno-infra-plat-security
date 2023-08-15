package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：容器和服务器防御策略
 * 数据表：server_defense_strategy
 * 表备注：容器和服务器防御策略表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("server_defense_strategy")
public class ServerDefenseStrategyEntity extends InfraBaseEntity {

    // fields

    /**
     * 策略名称
     */
    @TableField("strategy_name")
    private String strategyName;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 服务名称
     */
    @TableField("service_name")
    private String serviceName;

    /**
     * 标签
     */
    @TableField("tags")
    private String tags;

    /**
     * 是否开启
     */
    @TableField("is_enabled")
    private Integer isEnabled;

    /**
     * 防御配置
     */
    @TableField("defense_config")
    private String defenseConfig;

    /**
     * 端口防护
     */
    @TableField("port_protection")
    private String portProtection;

    /**
     * 服务器信息
     */
    @TableField("server_info")
    private String serverInfo;

    // getter and setter methods

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getDefenseConfig() {
        return defenseConfig;
    }

    public void setDefenseConfig(String defenseConfig) {
        this.defenseConfig = defenseConfig;
    }

    public String getPortProtection() {
        return portProtection;
    }

    public void setPortProtection(String portProtection) {
        this.portProtection = portProtection;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }
}
