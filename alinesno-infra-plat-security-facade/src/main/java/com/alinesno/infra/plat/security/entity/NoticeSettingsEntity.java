package com.alinesno.infra.plat.security.entity;

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
public class NoticeSettingsEntity extends InfraBaseEntity {

    // fields

    /**
     * 通知名称
     */
    @TableField("notice_name")
    private String noticeName;

    /**
     * 通知信息
     */
    @TableField("notice_info")
    private String noticeInfo;

    /**
     * webhook信息
     */
    @TableField("webhook_info")
    private String webhookInfo;

    /**
     * 通知类型
     */
    @TableField("notice_type")
    private String noticeType;

    /**
     * 通知密钥（钉钉）
     */
    @TableField("notice_key")
    private String noticeKey;

    /**
     * 是否启用
     */
    @TableField("is_enabled")
    private Integer isEnabled;

    // getter and setter methods

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getNoticeInfo() {
        return noticeInfo;
    }

    public void setNoticeInfo(String noticeInfo) {
        this.noticeInfo = noticeInfo;
    }

    public String getWebhookInfo() {
        return webhookInfo;
    }

    public void setWebhookInfo(String webhookInfo) {
        this.webhookInfo = webhookInfo;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public String getNoticeKey() {
        return noticeKey;
    }

    public void setNoticeKey(String noticeKey) {
        this.noticeKey = noticeKey;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }
}
