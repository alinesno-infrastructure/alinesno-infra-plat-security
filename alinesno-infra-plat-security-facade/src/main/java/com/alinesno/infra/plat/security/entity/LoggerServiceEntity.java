package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class LoggerServiceEntity extends InfraBaseEntity {

    // fields

    /**
     * 应用名称
     */
    @TableField("app_name")
	@ColumnType(length=50)
	@ColumnComment("应用名称")
    private String appName;

    /**
     * 异常请求
     */
    @TableField("exception_request")
	@ColumnType(length=255)
	@ColumnComment("异常请求")
    private String exceptionRequest;

    /**
     * 风险类型
     */
    @TableField("risk_type")
	@ColumnType(length=20)
	@ColumnComment("风险类型")
    private String riskType;

    /**
     * 风险时间
     */
    @TableField("risk_time")
	@ColumnType(length=19)
	@ColumnComment("风险时间")
    private Date riskTime;

    /**
     * 攻击IP
     */
    @TableField("attack_ip")
	@ColumnType(length=15)
	@ColumnComment("攻击IP")
    private String attackIp;

    /**
     * 所属应用服务
     */
    @TableField("belonging_service")
	@ColumnType(length=50)
	@ColumnComment("所属应用服务")
    private String belongingService;

    /**
     * 所属应用信息
     */
    @TableField("belonging_app_info")
	@ColumnType(length=255)
	@ColumnComment("所属应用信息")
    private String belongingAppInfo;

    /**
     * 异常信息
     */
    @TableField("exception_info")
	@ColumnType(length=255)
	@ColumnComment("异常信息")
    private String exceptionInfo;
}
