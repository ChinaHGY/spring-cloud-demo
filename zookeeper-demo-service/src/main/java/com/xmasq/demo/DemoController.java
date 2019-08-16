package com.xmasq.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RequestMapping("/api")
@RestController
public class DemoController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}
