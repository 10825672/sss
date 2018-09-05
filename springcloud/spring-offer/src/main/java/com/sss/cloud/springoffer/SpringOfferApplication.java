package com.sss.cloud.springoffer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = {"com.sss.cloud.springoffer.dao"})
public class SpringOfferApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOfferApplication.class, args);
    }
}
