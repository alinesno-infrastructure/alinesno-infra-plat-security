package com.alinesno.infra.plat.security.mapper;

import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import com.alinesno.infra.plat.security.entity.NginxDefenseStrategyEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NginxDefenseStrategyMapper extends IBaseMapper<NginxDefenseStrategyEntity> {
}
