package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：安全报告
 * 数据表：security_report
 * 表备注：安全报告表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("security_report")
public class SecurityReportEntity extends InfraBaseEntity {

    // fields

    /**
     * 状态
     */
    @TableField("status")
    private String status;

    /**
     * 所属类型
     */
    @TableField("belonging_type")
    private String belongingType;

    /**
     * 安全项目
     */
    @TableField("security_project")
    private String securityProject;

    /**
     * 风险信息
     */
    @TableField("risk_info")
    private String riskInfo;

    /**
     * 风险标识
     */
    @TableField("risk_identifier")
    private String riskIdentifier;

    /**
     * 风险数
     */
    @TableField("risk_count")
    private Long riskCount;

    // getter and setter methods

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBelongingType() {
        return belongingType;
    }

    public void setBelongingType(String belongingType) {
        this.belongingType = belongingType;
    }

    public String getSecurityProject() {
        return securityProject;
    }

    public void setSecurityProject(String securityProject) {
        this.securityProject = securityProject;
    }

    public String getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
    }

    public String getRiskIdentifier() {
        return riskIdentifier;
    }

    public void setRiskIdentifier(String riskIdentifier) {
        this.riskIdentifier = riskIdentifier;
    }

    public Long getRiskCount() {
        return riskCount;
    }

    public void setRiskCount(Long riskCount) {
        this.riskCount = riskCount;
    }
}
