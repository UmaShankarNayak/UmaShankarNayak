//package com.softcoders.order.config;
//
//import com.softcoders.order.dtos.ProductDto;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.reactive.function.client.WebClient;
//
//public class UserClient {
//
//    private WebClient webClient;
//
//    public UserClient(@Value("$(user-service-url)") String url) {
//        this.webClient = WebClient.builder().baseUrl(url).build();
//    }
//
//    public ProductDto getUserById(final String productId) {
//        return this.webClient.get().uri("{id}", productId)
//                .retrieve().bodyToMono(ProductDto.class).block();
//    }
//}
