package com.softcoders.order.serviceImpl;

//import com.softcoders.order.config.ProductClient;
import com.softcoders.order.dtos.ProductDto;
import com.softcoders.order.dtos.PurchaseOrderRequestDto;
import com.softcoders.order.dtos.PurchaseOrderResponseDto;
import com.softcoders.order.dtos.UserDto;
import com.softcoders.order.service.PurchaseOrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

@Service
@Slf4j
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

//    @Autowired
//    private ProductClient productClient;

    @Autowired
    @Qualifier("productRestTemplate")
    RestTemplate productRestTemplate;

    @Autowired
    RestTemplate userRestTemplate;

    @Override
    public PurchaseOrderResponseDto processOrder(PurchaseOrderRequestDto purchaseOrderRequestDto) {

        //Calling product service
        ProductDto productDto = productRequestResponse(purchaseOrderRequestDto.getProductId());

        //TODO please add checks for product, is available or not if not then return response


        UserDto userDto = new UserDto();
        userDto.setAmount(productDto.getPrice());
        userDto.setUserId(purchaseOrderRequestDto.getUserId());

        //Calling user service
        userRequestResponse(userDto);

        //Return response based on user service

        //TODO if all good, them save purchase order details in order db and return invoice as response
        return null;
    }

    private ProductDto productRequestResponse(String productId) {

        log.info("###### Calling to product service using product id - {}", productId);
        ProductDto productDto = productRestTemplate.getForObject("/1", ProductDto.class);
        log.info("###### Response from product product id - {}, product description - {}, product price - {}", productDto.getId(),
                productDto.getDescription(), productDto.getPrice());
        return productDto;
    }

    private UserDto userRequestResponse(UserDto userDto) {
        //TODO Mamatha pls add the user service

        //TODO if user response transaction declined in this case return amount is info....

        return null;
    }
}
