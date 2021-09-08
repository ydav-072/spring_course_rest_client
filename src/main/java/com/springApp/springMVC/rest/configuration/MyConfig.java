package com.springApp.springMVC.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.springApp.springMVC.rest")
public class MyConfig {

    @Bean // for creating http request
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
