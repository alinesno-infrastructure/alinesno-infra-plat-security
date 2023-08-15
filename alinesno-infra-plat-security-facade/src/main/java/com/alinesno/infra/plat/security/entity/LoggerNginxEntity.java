package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 功能名：攻击分析
 * 数据表：logger_nginx
 * 表备注：攻击分析表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("logger_nginx")
public class LoggerNginxEntity extends InfraBaseEntity {

    // fields

    /**
     * 应用名称
     */
    @TableField("app_name")
    private String appName;

    /**
     * 异常请求
     */
    @TableField("exception_request")
    private String exceptionRequest;

    /**
     * 风险类型
     */
    @TableField("risk_type")
    private String riskType;

    /**
     * 攻击时间
     */
    @TableField("attack_time")
    private Date attackTime;

    /**
     * 攻击IP
     */
    @TableField("attack_ip")
    private String attackIp;

    /**
     * 所属应用服务
     */
    @TableField("belonging_service")
    private String belongingService;

    /**
     * 所属应用信息
     */
    @TableField("belonging_app_info")
    private String belongingAppInfo;

    /**
     * 异常信息
     */
    @TableField("exception_info")
    private String exceptionInfo;

    // getter and setter

    /**
     * 获取应用名称
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * 设置应用名称
     */
    public LoggerNginxEntity setAppName(String arg) {
        this.appName = arg;
        return this;
    }

    /**
     * 获取异常请求
     */
    public String getExceptionRequest() {
        return this.exceptionRequest;
    }

    /**
     * 设置异常请求
     */
    public LoggerNginxEntity setExceptionRequest(String arg) {
        this.exceptionRequest = arg;
        return this;
    }

    /**
     * 获取风险类型
     */
    public String getRiskType() {
        return this.riskType;
    }

    /**
     * 设置风险类型
     */
    public LoggerNginxEntity setRiskType(String arg) {
        this.riskType = arg;
        return this;
    }

    /**
     * 获取攻击时间
     */
    public Date getAttackTime() {
        return this.attackTime;
    }

    /**
     * 设置攻击时间
     */
    public LoggerNginxEntity setAttackTime(Date arg) {
        this.attackTime = arg;
        return this;
    }

    /**
     * 获取攻击IP
     */
    public String getAttackIp() {
        return this.attackIp;
    }

    /**
     * 设置攻击IP
     */
    public LoggerNginxEntity setAttackIp(String arg) {
        this.attackIp = arg;
        return this;
    }

    /**
     * 获取所属应用服务
     */
    public String getBelongingService() {
        return this.belongingService;
    }

    /**
     * 设置所属应用服务
     */
    public LoggerNginxEntity setBelongingService(String arg) {
        this.belongingService = arg;
        return this;
    }

    /**
     * 获取所属应用信息
     */
    public String getBelongingAppInfo() {
        return this.belongingAppInfo;
    }

    /**
     * 设置所属应用信息
     */
    public LoggerNginxEntity setBelongingAppInfo(String arg) {
        this.belongingAppInfo = arg;
        return this;
    }

    /**
     * 获取异常信息
     */
    public String getExceptionInfo() {
        return this.exceptionInfo;
    }

    /**
     * 设置异常信息
     */
    public LoggerNginxEntity setExceptionInfo(String arg) {
        this.exceptionInfo = arg;
        return this;
    }
}
