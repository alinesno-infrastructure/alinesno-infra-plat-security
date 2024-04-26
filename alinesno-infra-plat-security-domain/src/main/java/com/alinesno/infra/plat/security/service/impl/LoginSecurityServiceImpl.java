package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.LoginSecurityEntity;
import com.alinesno.infra.plat.security.mapper.LoginSecurityMapper;
import com.alinesno.infra.plat.security.service.ILoginSecurityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginSecurityServiceImpl extends IBaseServiceImpl<LoginSecurityEntity, LoginSecurityMapper> implements ILoginSecurityService {

}
