package com.xmasq.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */

@RequestMapping("/demo-ribbon")
@RestController
public class DemoRestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello-world")
    public String helloWorld() {
        return restTemplate.getForObject("http://eureka-demo-service/demo-api/hgy", String.class);
    }
}
