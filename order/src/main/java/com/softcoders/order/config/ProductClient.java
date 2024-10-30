//package com.softcoders.order.config;
//
//import com.softcoders.order.dtos.ProductDto;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.client.WebClient;
//
//@Component
//public class ProductClient {
//
//    private WebClient webClient;
//
//    public ProductClient(@Value("$(product-service-url)") String url) {
//        this.webClient = WebClient.builder().baseUrl(url).build();
//    }
//
//    public ProductDto getProductById(final String productId) {
//        return this.webClient.get().uri("{id}", productId)
//                .retrieve().bodyToMono(ProductDto.class).block();
//    }
//}
