package com.alinesno.infra.plat.security.mapper;

import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import com.alinesno.infra.plat.security.entity.ComplianceCheckEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ComplianceCheckMapper extends IBaseMapper<ComplianceCheckEntity> {
}
