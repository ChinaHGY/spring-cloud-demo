package com.xmasq.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RequestMapping("/demo-api")
@RestController
public class DemoRestController {

    @GetMapping(value = "/{value}")
    public String helloWorld(@PathVariable(value =  "value") String value){
        return "Hello," + value;
    }
}
