package com.alinesno.infra.plat.security.config;

import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import com.alinesno.infra.common.web.log.aspect.LogAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置管理中心
 */
@EnableActable
@MapperScan("com.alinesno.infra.plat.security.mapper")
@EnableInfraSsoApi
@Configuration
public class AppConfiguration {

    /**
     * 日志操作拦截
     * @return
     */
    @Bean
    public LogAspect getLogAspect(){
        return new LogAspect() ;
    }

}
