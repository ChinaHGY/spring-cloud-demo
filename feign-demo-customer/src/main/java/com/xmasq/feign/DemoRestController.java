package com.xmasq.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RequestMapping("/demo-feign")
@RestController
public class DemoRestController {

    @Autowired
    private DemoApiService demoApiService;

    @GetMapping(value = "/hello-world")
    public String helloWorld() {
        return demoApiService.helloWorld("feign");
    }
}
