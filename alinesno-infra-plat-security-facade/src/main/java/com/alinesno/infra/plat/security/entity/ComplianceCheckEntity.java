package com.alinesno.infra.plat.security.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 功能名：合规检测
 * 数据表：compliance_check
 * 表备注：合规检测表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("compliance_check")
public class ComplianceCheckEntity extends InfraBaseEntity {

    // fields

    /**
     * 编号
     */
    @Excel(name = "编号")
    @TableField("item_id")
    private Long itemId;

    /**
     * 检测项目
     */
    @Excel(name = "检测项目")
    @TableField("check_project")
    private String checkProject;

    /**
     * 检测项分类
     */
    @Excel(name = "检测项分类")
    @TableField("check_category")
    private String checkCategory;

    /**
     * 合规状态
     */
    @Excel(name = "合规状态")
    @TableField("compliance_status")
    private String complianceStatus;

    /**
     * 改进建设
     */
    @Excel(name = "改进建设")
    @TableField("improvement_construction")
    private String improvementConstruction;

    // getter and setter

    public Long getItemId() {
        return this.itemId;
    }

    public ComplianceCheckEntity setItemId(Long arg) {
        this.itemId = arg;
        return this;
    }

    public String getCheckProject() {
        return this.checkProject;
    }

    public ComplianceCheckEntity setCheckProject(String arg) {
        this.checkProject = arg;
        return this;
    }

    public String getCheckCategory() {
        return this.checkCategory;
    }

    public ComplianceCheckEntity setCheckCategory(String arg) {
        this.checkCategory = arg;
        return this;
    }

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    public ComplianceCheckEntity setComplianceStatus(String arg) {
        this.complianceStatus = arg;
        return this;
    }

    public String getImprovementConstruction() {
        return this.improvementConstruction;
    }

    public ComplianceCheckEntity setImprovementConstruction(String arg) {
        this.improvementConstruction = arg;
        return this;
    }
}
