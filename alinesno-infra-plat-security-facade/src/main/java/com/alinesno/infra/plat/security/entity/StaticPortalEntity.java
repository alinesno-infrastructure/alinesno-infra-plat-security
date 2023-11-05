package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class StaticPortalEntity extends InfraBaseEntity {

    // fields

    /**
     * 代码安全数
     */
    @TableField("code_security_count")
	@ColumnType(length=10)
	@ColumnComment("代码安全数")
    private Long codeSecurityCount;

    /**
     * 异常文件上传数
     */
    @TableField("file_upload_exception_count")
	@ColumnType(length=255)
	@ColumnComment("异常文件上传数")
    private Long fileUploadExceptionCount;

    /**
     * 业务操作风险数
     */
    @TableField("business_risk_count")
	@ColumnType(length=10)
	@ColumnComment("业务操作风险数")
    private Long businessRiskCount;

    /**
     * 系统运行异常数
     */
    @TableField("system_exception_count")
	@ColumnType(length=10)
	@ColumnComment("系统运行异常数")
    private Long systemExceptionCount;

    /**
     * 访问SQL注入异常
     */
    @TableField("sql_injection_count")
	@ColumnType(length=10)
	@ColumnComment("访问SQL注入异常")
    private Long sqlInjectionCount;

    /**
     * 异常登陆风险
     */
    @TableField("abnormal_login_risk_count")
	@ColumnType(length=10)
	@ColumnComment("异常登陆风险")
    private Long abnormalLoginRiskCount;

    /**
     * 安全运营数
     */
    @TableField("security_operation_count")
	@ColumnType(length=10)
	@ColumnComment("安全运营数")
    private String securityOperationCount;
}
