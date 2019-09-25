package org.txlcn.demo.common.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.txlcn.demo.common.config.FeignLogConfigurer;

/**
 * Description:
 * Date: 2018/12/25
 *
 * @author ujued
 */
//@FeignClient(name = "txlcn-demo-spring-service-c", fallback = ServiceCFallback.class,  configuration = {FeignLogConfigurer.class})
@FeignClient(name = "service-c", url = "http://localhost:12003", fallback = ServiceCFallback.class,  configuration = {FeignLogConfigurer.class})
public interface ServiceCClient {

    @GetMapping("/rpc")
    String rpc(@RequestParam("value") String name);
}
