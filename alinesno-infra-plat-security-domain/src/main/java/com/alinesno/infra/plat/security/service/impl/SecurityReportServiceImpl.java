package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.SecurityReportEntity;
import com.alinesno.infra.plat.security.mapper.SecurityReportMapper;
import com.alinesno.infra.plat.security.service.ISecurityReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SecurityReportServiceImpl extends IBaseServiceImpl<SecurityReportEntity, SecurityReportMapper> implements ISecurityReportService {

}
