package com.alinesno.infra.plat.security.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;

/**
 * 代码漏洞
 * 数据表：code_owasp
 * 表备注：代码漏洞表
 * 
 * 注意：该代码已进行了格式化和调整，确保代码的可读性和一致性。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("code_owasp")
@Data
public class CodeOwaspEntity extends InfraBaseEntity {
    
    // 问题名称
    @TableField("issue_name")
	@ColumnType(length=255)
	@ColumnComment("问题名称")
    private String issueName;

    // 类型
    @TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
    private String type;

    // 文件名
    @TableField("file_name")
	@ColumnType(length=255)
	@ColumnComment("文件名")
    private String fileName;

    // 问题等级
    @TableField("severity")
	@ColumnType(length=1)
	@ColumnComment("问题等级")
    private String severity;

    // 异常信息
    @TableField("exception_info")
	@ColumnType(length=255)
	@ColumnComment("异常信息")
    private String exceptionInfo;

    // 异常行数
    @TableField("exception_line_number")
	@ColumnType(length=10)
	@ColumnComment("异常行数")
    private Integer exceptionLineNumber;

    // 所属应用服务
    @TableField("belonging_service")
	@ColumnType(length=50)
	@ColumnComment("所属应用服务")
    private String belongingService;

    // 应用名称
    @TableField("app_name")
	@ColumnType(length=50)
	@ColumnComment("应用名称")
    private String appName;
}
