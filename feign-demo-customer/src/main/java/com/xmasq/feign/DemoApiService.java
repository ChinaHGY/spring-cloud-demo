package com.xmasq.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@FeignClient(name = "eureka-demo-service", path = "/demo-api")
public interface DemoApiService {

    @GetMapping(value = "/{value}")
    String helloWorld(@PathVariable(value =  "value") String value);

}
