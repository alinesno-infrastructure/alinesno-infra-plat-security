package com.alinesno.infra.plat.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;

/**
 * 规范检测
 * 数据表：code_rule
 * 表备注：规范检测表
 * 
 * 注意：该代码已进行了格式化和调整，确保代码的可读性和一致性。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("code_rule")
public class CodeRuleEntity extends InfraBaseEntity {
    
    // 开始行数
    @TableField("begin_line_number")
    private Long beginLineNumber;

    // 结束行数
    @TableField("end_line_number")
    private Long endLineNumber;

    // 开始字符
    @TableField("begin_character_number")
    private Long beginCharacterNumber;

    // 结束字符
    @TableField("end_character_number")
    private Long endCharacterNumber;

    // 规范名称
    @TableField("rule_name")
    private String ruleName;

    // 规范集全名
    @TableField("ruleset_name")
    private String rulesetName;

    // 包名
    @TableField("package_name")
    private String packageName;

    // 类名
    @TableField("class_name")
    private String className;

    // 异常信息
    @TableField("exception_info")
    private String exceptionInfo;

    // 风险等级
    @TableField("risk_level")
    private String riskLevel;

    // 应用名称
    @TableField("app_name")
    private String appName;

    // 所属应用信息
    @TableField("belonging_app_info")
    private String belongingAppInfo;

    // getter and setter
    public Long getBeginLineNumber() {
        return this.beginLineNumber;
    }

    public CodeRuleEntity setBeginLineNumber(Long beginLineNumber) {
        this.beginLineNumber = beginLineNumber;
        return this;
    }

    public Long getEndLineNumber() {
        return this.endLineNumber;
    }

    public CodeRuleEntity setEndLineNumber(Long endLineNumber) {
        this.endLineNumber = endLineNumber;
        return this;
    }

    public Long getBeginCharacterNumber() {
        return this.beginCharacterNumber;
    }

    public CodeRuleEntity setBeginCharacterNumber(Long beginCharacterNumber) {
        this.beginCharacterNumber = beginCharacterNumber;
        return this;
    }

    public Long getEndCharacterNumber() {
        return this.endCharacterNumber;
    }

    public CodeRuleEntity setEndCharacterNumber(Long endCharacterNumber) {
        this.endCharacterNumber = endCharacterNumber;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public CodeRuleEntity setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRulesetName() {
        return this.rulesetName;
    }

    public CodeRuleEntity setRulesetName(String rulesetName) {
        this.rulesetName = rulesetName;
        return this;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public CodeRuleEntity setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public CodeRuleEntity setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getExceptionInfo() {
        return this.exceptionInfo;
    }

    public CodeRuleEntity setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
        return this;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }

    public CodeRuleEntity setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    public String getAppName() {
        return this.appName;
    }

    public CodeRuleEntity setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public String getBelongingAppInfo() {
        return this.belongingAppInfo;
    }

    public CodeRuleEntity setBelongingAppInfo(String belongingAppInfo) {
        this.belongingAppInfo = belongingAppInfo;
        return this;
    }
}
