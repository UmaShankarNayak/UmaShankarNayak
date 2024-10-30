package com.softcoders.product.controller;

import com.softcoders.product.dtos.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {


    //save product

    // get all

    // price - range  1000 to 1500

    // update product and delete product
    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable String id) {
        //TODO - call to database & fetch the product details based on product id.
        log.info("##Info## product api called... ");
        //This is dummy data only after implementation of TODO it will remove
        ProductDto productDto = new ProductDto();
        productDto.setId("Iphone123");
        productDto.setDescription("Iphone 16 pro max");
        productDto.setPrice(150000);
       return ResponseEntity.ok(productDto);
    }




}
