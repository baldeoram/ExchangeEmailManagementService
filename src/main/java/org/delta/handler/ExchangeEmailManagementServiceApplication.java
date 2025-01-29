package org.delta.handler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.delta.handler", "org.delta.handler.controller" , "org.openapitools.configuration"})
public class ExchangeEmailManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangeEmailManagementServiceApplication.class, args);
    }


}