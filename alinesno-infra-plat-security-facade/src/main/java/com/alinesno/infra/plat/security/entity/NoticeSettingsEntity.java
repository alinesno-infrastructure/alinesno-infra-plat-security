package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：通知设置
 * 数据表：notice_settings
 * 表备注：通知设置表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("notice_settings")
@Data
public class NoticeSettingsEntity extends InfraBaseEntity {

    // fields

    /**
     * 通知名称
     */
    @TableField("notice_name")
	@ColumnType(length=50)
	@ColumnComment("通知名称")
    private String noticeName;

    /**
     * 通知信息
     */
    @TableField("notice_info")
	@ColumnType(length=255)
	@ColumnComment("通知信息")
    private String noticeInfo;

    /**
     * webhook信息
     */
    @TableField("webhook_info")
	@ColumnType(length=255)
	@ColumnComment("webhook信息")
    private String webhookInfo;

    /**
     * 通知类型
     */
    @TableField("notice_type")
	@ColumnType(length=10)
	@ColumnComment("通知类型")
    private String noticeType;

    /**
     * 通知密钥（钉钉）
     */
    @TableField("notice_key")
	@ColumnType(length=50)
	@ColumnComment("通知密钥（钉钉）")
    private String noticeKey;

    /**
     * 是否启用
     */
    @TableField("is_enabled")
	@ColumnType(length=1)
	@ColumnComment("是否启用")
    private Integer isEnabled;
}
