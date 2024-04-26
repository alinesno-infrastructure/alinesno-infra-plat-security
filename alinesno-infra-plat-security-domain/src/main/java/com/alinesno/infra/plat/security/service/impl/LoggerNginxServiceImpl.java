package com.alinesno.infra.plat.security.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.security.entity.LoggerNginxEntity;
import com.alinesno.infra.plat.security.mapper.LoggerNginxMapper;
import com.alinesno.infra.plat.security.service.ILoggerNginxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggerNginxServiceImpl extends IBaseServiceImpl<LoggerNginxEntity, LoggerNginxMapper> implements ILoggerNginxService {

}
