package org.txlcn.demo.common.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 *
 * @auther: luoqy@cnjnb.com
 * @date: 2019/3/27 10:09
 */
@Configuration
public class FeignLogConfigurer {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
