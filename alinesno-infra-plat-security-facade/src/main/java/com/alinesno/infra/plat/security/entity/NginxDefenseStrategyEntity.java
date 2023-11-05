package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：Nginx防御策略
 * 数据表：nginx_defense_strategy
 * 表备注：Nginx防御策略表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("nginx_defense_strategy")
@Data
public class NginxDefenseStrategyEntity extends InfraBaseEntity {

    // fields

    /**
     * 策略名称
     */
    @TableField("strategy_name")
	@ColumnType(length=50)
	@ColumnComment("策略名称")
    private String strategyName;

    /**
     * 描述
     */
    @TableField("description")
	@ColumnType(length=255)
	@ColumnComment("描述")
    private String description;

    /**
     * 服务名称
     */
    @TableField("service_name")
	@ColumnType(length=255)
	@ColumnComment("服务名称")
    private String serviceName;

    /**
     * 标签
     */
    @TableField("tags")
	@ColumnType(length=255)
	@ColumnComment("标签")
    private String tags;

    /**
     * 是否开启
     */
    @TableField("is_enabled")
	@ColumnType(length=1)
	@ColumnComment("是否开启")
    private Integer isEnabled;

    /**
     * 防御配置
     */
    @TableField("defense_config")
	@ColumnType(length=255)
	@ColumnComment("防御配置")
    private String defenseConfig;

    /**
     * 端口防护
     */
    @TableField("port_protection")
	@ColumnType(length=1)
	@ColumnComment("端口防护")
    private String portProtection;
}
