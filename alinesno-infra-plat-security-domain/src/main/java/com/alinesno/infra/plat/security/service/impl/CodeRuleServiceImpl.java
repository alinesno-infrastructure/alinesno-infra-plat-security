package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.CodeRuleEntity;
import com.alinesno.infra.plat.security.mapper.CodeRuleMapper;
import com.alinesno.infra.plat.security.service.ICodeRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CodeRuleServiceImpl extends IBaseServiceImpl<CodeRuleEntity, CodeRuleMapper> implements ICodeRuleService {

}
