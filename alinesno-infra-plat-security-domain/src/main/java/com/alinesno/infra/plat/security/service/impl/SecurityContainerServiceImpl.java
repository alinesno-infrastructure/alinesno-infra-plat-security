package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.SecurityContainerEntity;
import com.alinesno.infra.plat.security.mapper.SecurityContainerMapper;
import com.alinesno.infra.plat.security.service.ISecurityContainerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SecurityContainerServiceImpl extends IBaseServiceImpl<SecurityContainerEntity, SecurityContainerMapper> implements ISecurityContainerService {

}
