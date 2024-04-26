package com.alinesno.infra.plat.security.mapper;

import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import com.alinesno.infra.plat.security.entity.CodeOwaspEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CodeOwaspMapper extends IBaseMapper<CodeOwaspEntity> {
}
