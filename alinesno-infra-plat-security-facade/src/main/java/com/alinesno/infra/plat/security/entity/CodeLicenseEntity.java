package com.alinesno.infra.plat.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;

/**
 * 代码版本
 * 数据表：code_license
 * 表备注：代码版本表
 * 
 * 注意：该代码已进行了格式化和调整，确保代码的可读性和一致性。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("code_license")
public class CodeLicenseEntity extends InfraBaseEntity {
    
    // 问题名称
    @TableField("issue_name")
    private String issueName;

    // 类型
    @TableField("type")
    private String type;

    // 文件名
    @TableField("file_name")
    private String fileName;

    // 问题等级
    @TableField("severity")
    private String severity;

    // 异常信息
    @TableField("exception_info")
    private String exceptionInfo;

    // 所属应用服务
    @TableField("belonging_service")
    private String belongingService;

    // 应用名称
    @TableField("app_name")
    private String appName;

    // 代码groupId
    @TableField("code_groupId")
    private String codeGroupId;

    // 代码articleId
    @TableField("code_articleId")
    private String codeArticleId;

    // 代码version
    @TableField("code_version")
    private String codeVersion;

    // getter and setter methods

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }

    public String getBelongingService() {
        return belongingService;
    }

    public void setBelongingService(String belongingService) {
        this.belongingService = belongingService;
    }

    public String getAppName() {
        return appName;
    }
}
   
