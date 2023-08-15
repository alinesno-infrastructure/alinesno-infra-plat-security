package com.alinesno.infra.plat.security.entity;

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
public class LoginSecurityEntity extends InfraBaseEntity {

    // fields

    /**
     * 登陆IP
     */
    @TableField("login_ip")
    private String loginIp;

    /**
     * 登陆应用
     */
    @TableField("login_app")
    private String loginApp;

    /**
     * 登陆账号
     */
    @TableField("login_account")
    private String loginAccount;

    /**
     * 登陆异常风险
     */
    @TableField("login_exception_risk")
    private String loginExceptionRisk;

    /**
     * 登陆位置
     */
    @TableField("login_location")
    private String loginLocation;

    /**
     * 风险是否处理
     */
    @TableField("is_risk_handled")
    private Integer isRiskHandled;

    // getter and setter methods

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginApp() {
        return loginApp;
    }

    public void setLoginApp(String loginApp) {
        this.loginApp = loginApp;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginExceptionRisk() {
        return loginExceptionRisk;
    }

    public void setLoginExceptionRisk(String loginExceptionRisk) {
        this.loginExceptionRisk = loginExceptionRisk;
    }

    public String getLoginLocation() {
        return loginLocation;
    }

    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation;
    }

    public Integer getIsRiskHandled() {
        return isRiskHandled;
    }

    public void setIsRiskHandled(Integer isRiskHandled) {
        this.isRiskHandled = isRiskHandled;
    }
}
