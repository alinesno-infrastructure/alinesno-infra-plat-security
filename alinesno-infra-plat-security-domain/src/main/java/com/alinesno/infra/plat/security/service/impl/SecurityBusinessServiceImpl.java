package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.SecurityBusinessEntity;
import com.alinesno.infra.plat.security.mapper.SecurityBusinessMapper;
import com.alinesno.infra.plat.security.service.ISecurityBusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SecurityBusinessServiceImpl extends IBaseServiceImpl<SecurityBusinessEntity, SecurityBusinessMapper> implements ISecurityBusinessService {

}
