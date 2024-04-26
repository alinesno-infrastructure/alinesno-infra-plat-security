package com.alinesno.infra.plat.security.mapper;

import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import com.alinesno.infra.plat.security.entity.LoggerBusinessEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoggerBusinessMapper extends IBaseMapper<LoggerBusinessEntity> {
}
