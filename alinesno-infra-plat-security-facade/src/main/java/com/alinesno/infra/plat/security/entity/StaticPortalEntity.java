package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：静态门户
 * 数据表：static_portal
 * 表备注：静态门户表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("static_portal")
public class StaticPortalEntity extends InfraBaseEntity {

    // fields

    /**
     * 代码安全数
     */
    @TableField("code_security_count")
    private Long codeSecurityCount;

    /**
     * 异常文件上传数
     */
    @TableField("file_upload_exception_count")
    private Long fileUploadExceptionCount;

    /**
     * 业务操作风险数
     */
    @TableField("business_risk_count")
    private Long businessRiskCount;

    /**
     * 系统运行异常数
     */
    @TableField("system_exception_count")
    private Long systemExceptionCount;

    /**
     * 访问SQL注入异常
     */
    @TableField("sql_injection_count")
    private Long sqlInjectionCount;

    /**
     * 异常登陆风险
     */
    @TableField("abnormal_login_risk_count")
    private Long abnormalLoginRiskCount;

    /**
     * 安全运营数
     */
    @TableField("security_operation_count")
    private String securityOperationCount;

    // getter and setter methods

    public Long getCodeSecurityCount() {
        return codeSecurityCount;
    }

    public void setCodeSecurityCount(Long codeSecurityCount) {
        this.codeSecurityCount = codeSecurityCount;
    }

    public Long getFileUploadExceptionCount() {
        return fileUploadExceptionCount;
    }

    public void setFileUploadExceptionCount(Long fileUploadExceptionCount) {
        this.fileUploadExceptionCount = fileUploadExceptionCount;
    }

    public Long getBusinessRiskCount() {
        return businessRiskCount;
    }

    public void setBusinessRiskCount(Long businessRiskCount) {
        this.businessRiskCount = businessRiskCount;
    }

    public Long getSystemExceptionCount() {
        return systemExceptionCount;
    }

    public void setSystemExceptionCount(Long systemExceptionCount) {
        this.systemExceptionCount = systemExceptionCount;
    }

    public Long getSqlInjectionCount() {
        return sqlInjectionCount;
    }

    public void setSqlInjectionCount(Long sqlInjectionCount) {
        this.sqlInjectionCount = sqlInjectionCount;
    }

    public Long getAbnormalLoginRiskCount() {
        return abnormalLoginRiskCount;
    }

    public void setAbnormalLoginRiskCount(Long abnormalLoginRiskCount) {
        this.abnormalLoginRiskCount = abnormalLoginRiskCount;
    }

    public String getSecurityOperationCount() {
        return securityOperationCount;
    }

    public void setSecurityOperationCount(String securityOperationCount) {
        this.securityOperationCount = securityOperationCount;
    }
}
