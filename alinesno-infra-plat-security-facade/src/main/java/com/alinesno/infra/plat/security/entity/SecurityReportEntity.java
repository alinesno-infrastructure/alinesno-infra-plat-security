package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class SecurityReportEntity extends InfraBaseEntity {

    // fields

    /**
     * 状态
     */
    @TableField("status")
	@ColumnType(length=1)
	@ColumnComment("状态")
    private String status;

    /**
     * 所属类型
     */
    @TableField("belonging_type")
	@ColumnType(length=20)
	@ColumnComment("所属类型")
    private String belongingType;

    /**
     * 安全项目
     */
    @TableField("security_project")
	@ColumnType(length=255)
	@ColumnComment("安全项目")
    private String securityProject;

    /**
     * 风险信息
     */
    @TableField("risk_info")
	@ColumnType(length=255)
	@ColumnComment("风险信息")
    private String riskInfo;

    /**
     * 风险标识
     */
    @TableField("risk_identifier")
	@ColumnType(length=50)
	@ColumnComment("风险标识")
    private String riskIdentifier;

    /**
     * 风险数
     */
    @TableField("risk_count")
	@ColumnType(length=10)
	@ColumnComment("风险数")
    private Long riskCount;
}
