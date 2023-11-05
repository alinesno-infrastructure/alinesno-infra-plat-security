package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class ComplianceCheckEntity extends InfraBaseEntity {

    // fields

    /**
     * 编号
     */
    @Excel(name = "编号")
    @TableField("item_id")
	@ColumnType(length=50)
	@ColumnComment("编号")
    private Long itemId;

    /**
     * 检测项目
     */
    @Excel(name = "检测项目")
    @TableField("check_project")
	@ColumnType(length=255)
	@ColumnComment("检测项目")
    private String checkProject;

    /**
     * 检测项分类
     */
    @Excel(name = "检测项分类")
    @TableField("check_category")
	@ColumnType(length=50)
	@ColumnComment("检测项分类")
    private String checkCategory;

    /**
     * 合规状态
     */
    @Excel(name = "合规状态")
    @TableField("compliance_status")
	@ColumnType(length=10)
	@ColumnComment("合规状态")
    private String complianceStatus;

    /**
     * 改进建设
     */
    @Excel(name = "改进建设")
    @TableField("improvement_construction")
	@ColumnType(length=255)
	@ColumnComment("改进建设")
    private String improvementConstruction;
}
