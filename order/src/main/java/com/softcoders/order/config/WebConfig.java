package com.softcoders.order.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class WebConfig {


    @Value("$(product-service-url)")
    public String productServiceBaseUri;

    @Value("$(user-service-url)")
    public String userServiceBaseUri;

    @Bean(name = "productRestTemplate")
    public RestTemplate productRestTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(3000))
                .setReadTimeout(Duration.ofMillis(3000))
                .rootUri("http://localhost:3040/product")
                .build();
        // calling to product service
    }


    @Bean(name = "userRestTemplate")
    @Primary
    public RestTemplate userRestTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(3000))
                .setReadTimeout(Duration.ofMillis(3000))
                .rootUri("http://localhost:3030/user")
                .build();
        // calling to product service
    }

}
