package com.xmasq.feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignDemoCustomer {

    public static void main(String[] args) {
        SpringApplication.run(FeignDemoCustomer.class, args);
    }

}
