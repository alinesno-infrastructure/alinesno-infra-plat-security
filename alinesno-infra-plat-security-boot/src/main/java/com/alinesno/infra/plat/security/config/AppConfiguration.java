package com.alinesno.infra.plat.security.config;

import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import com.alinesno.infra.common.web.log.aspect.LogAspect;
import com.dtflys.forest.springboot.annotation.ForestScan;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置管理中心
 */
@Slf4j
@EnableActable
@MapperScan("com.alinesno.infra.plat.security.mapper")
@ForestScan({
        "com.alinesno.infra.common.web.adapter.base.consumer" ,
})
@EnableInfraSsoApi
@Configuration
public class AppConfiguration implements CommandLineRunner {

    /**
     * 日志操作拦截
     * @return
     */
    @Bean
    public LogAspect getLogAspect(){
        return new LogAspect() ;
    }

    @Override
    public void run(String... args) throws Exception {
        log.debug("AppConfiguration.run");
    }

}
