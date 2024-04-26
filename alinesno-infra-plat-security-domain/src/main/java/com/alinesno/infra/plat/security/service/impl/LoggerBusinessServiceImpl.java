package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.LoggerBusinessEntity;
import com.alinesno.infra.plat.security.mapper.LoggerBusinessMapper;
import com.alinesno.infra.plat.security.service.ILoggerBusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggerBusinessServiceImpl extends IBaseServiceImpl<LoggerBusinessEntity, LoggerBusinessMapper> implements ILoggerBusinessService {

}
