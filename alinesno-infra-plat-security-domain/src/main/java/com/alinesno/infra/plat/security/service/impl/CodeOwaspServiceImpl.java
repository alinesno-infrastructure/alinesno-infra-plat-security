package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.CodeOwaspEntity;
import com.alinesno.infra.plat.security.mapper.CodeOwaspMapper;
import com.alinesno.infra.plat.security.service.ICodeOwaspService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CodeOwaspServiceImpl extends IBaseServiceImpl<CodeOwaspEntity, CodeOwaspMapper> implements ICodeOwaspService {

}
