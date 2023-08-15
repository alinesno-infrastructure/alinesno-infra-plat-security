package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 功能名：日志分析
 * 数据表：logger_service
 * 表备注：日志分析表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("logger_service")
public class LoggerServiceEntity extends InfraBaseEntity {

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
     * 风险时间
     */
    @TableField("risk_time")
    private Date riskTime;

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

    // getter and setter methods

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getExceptionRequest() {
        return exceptionRequest;
    }

    public void setExceptionRequest(String exceptionRequest) {
        this.exceptionRequest = exceptionRequest;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public Date getRiskTime() {
        return riskTime;
    }

    public void setRiskTime(Date riskTime) {
        this.riskTime = riskTime;
    }

    public String getAttackIp() {
        return attackIp;
    }

    public void setAttackIp(String attackIp) {
        this.attackIp = attackIp;
    }

    public String getBelongingService() {
        return belongingService;
    }

    public void setBelongingService(String belongingService) {
        this.belongingService = belongingService;
    }

    public String getBelongingAppInfo() {
        return belongingAppInfo;
    }

    public void setBelongingAppInfo(String belongingAppInfo) {
        this.belongingAppInfo = belongingAppInfo;
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }
}
