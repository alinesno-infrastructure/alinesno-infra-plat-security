package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：容器资产
 * 数据表：security_container
 * 表备注：容器资产表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("security_container")
@Data
public class SecurityContainerEntity extends InfraBaseEntity {

    // fields

    /**
     * 容器名称
     */
    @TableField("container_name")
	@ColumnType(length=255)
	@ColumnComment("容器名称")
    private String containerName;

    /**
     * 容器标识
     */
    @TableField("container_identifier")
	@ColumnType(length=50)
	@ColumnComment("容器标识")
    private String containerIdentifier;

    /**
     * 容器地址名称
     */
    @TableField("container_address_name")
	@ColumnType(length=255)
	@ColumnComment("容器地址名称")
    private String containerAddressName;

    /**
     * 容器状态
     */
    @TableField("container_status")
	@ColumnType(length=20)
	@ColumnComment("容器状态")
    private String containerStatus;

    /**
     * 应用运行状态
     */
    @TableField("app_running_status")
	@ColumnType(length=1)
	@ColumnComment("应用运行状态")
    private String appRunningStatus;

    /**
     * 风险数
     */
    @TableField("risk_count")
	@ColumnType(length=10)
	@ColumnComment("风险数")
    private String riskCount;

    /**
     * 高危数
     */
    @TableField("high_risk_count")
	@ColumnType(length=255)
	@ColumnComment("高危数")
    private String highRiskCount;
}
