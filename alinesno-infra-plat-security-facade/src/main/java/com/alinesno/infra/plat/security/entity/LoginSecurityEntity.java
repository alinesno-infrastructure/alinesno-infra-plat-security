package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 功能名：登陆风险数
 * 数据表：login_security
 * 表备注：登陆风险数表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("login_security")
@Data
public class LoginSecurityEntity extends InfraBaseEntity {

    // fields

    /**
     * 登陆IP
     */
    @TableField("login_ip")
	@ColumnType(length=15)
	@ColumnComment("登陆IP")
    private String loginIp;

    /**
     * 登陆应用
     */
    @TableField("login_app")
	@ColumnType(length=20)
	@ColumnComment("登陆应用")
    private String loginApp;

    /**
     * 登陆账号
     */
    @TableField("login_account")
	@ColumnType(length=50)
	@ColumnComment("登陆账号")
    private String loginAccount;

    /**
     * 登陆异常风险
     */
    @TableField("login_exception_risk")
	@ColumnType(length=1)
	@ColumnComment("登陆异常风险")
    private String loginExceptionRisk;

    /**
     * 登陆位置
     */
    @TableField("login_location")
	@ColumnType(length=50)
	@ColumnComment("登陆位置")
    private String loginLocation;

    /**
     * 风险是否处理
     */
    @TableField("is_risk_handled")
	@ColumnType(length=1)
	@ColumnComment("风险是否处理")
    private Integer isRiskHandled;
}
