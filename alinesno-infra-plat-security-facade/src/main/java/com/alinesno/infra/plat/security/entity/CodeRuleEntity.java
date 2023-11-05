package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class CodeRuleEntity extends InfraBaseEntity {
    
    // 开始行数
    @TableField("begin_line_number")
	@ColumnType(length=10)
	@ColumnComment("开始行数")
    private Long beginLineNumber;

    // 结束行数
    @TableField("end_line_number")
	@ColumnType(length=255)
	@ColumnComment("结束行数")
    private Long endLineNumber;

    // 开始字符
    @TableField("begin_character_number")
	@ColumnType(length=2)
	@ColumnComment("开始字符")
    private Long beginCharacterNumber;

    // 结束字符
    @TableField("end_character_number")
	@ColumnType(length=10)
	@ColumnComment("结束字符")
    private Long endCharacterNumber;

    // 规范名称
    @TableField("rule_name")
	@ColumnType(length=50)
	@ColumnComment("规范名称")
    private String ruleName;

    // 规范集全名
    @TableField("ruleset_name")
	@ColumnType(length=50)
	@ColumnComment("规范集全名")
    private String rulesetName;

    // 包名
    @TableField("package_name")
	@ColumnType(length=50)
	@ColumnComment("包名")
    private String packageName;

    // 类名
    @TableField("class_name")
	@ColumnType(length=255)
	@ColumnComment("类名")
    private String className;

    // 异常信息
    @TableField("exception_info")
	@ColumnType(length=255)
	@ColumnComment("异常信息")
    private String exceptionInfo;

    // 风险等级
    @TableField("risk_level")
	@ColumnType(length=1)
	@ColumnComment("风险等级")
    private String riskLevel;

    // 应用名称
    @TableField("app_name")
	@ColumnType(length=50)
	@ColumnComment("应用名称")
    private String appName;

    // 所属应用信息
    @TableField("belonging_app_info")
	@ColumnType(length=255)
	@ColumnComment("所属应用信息")
    private String belongingAppInfo;
}
