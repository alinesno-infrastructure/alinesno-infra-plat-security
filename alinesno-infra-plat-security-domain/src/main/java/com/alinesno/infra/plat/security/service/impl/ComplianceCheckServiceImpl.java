package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.ComplianceCheckEntity;
import com.alinesno.infra.plat.security.mapper.ComplianceCheckMapper;
import com.alinesno.infra.plat.security.service.IComplianceCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ComplianceCheckServiceImpl extends IBaseServiceImpl<ComplianceCheckEntity, ComplianceCheckMapper> implements IComplianceCheckService {

}
