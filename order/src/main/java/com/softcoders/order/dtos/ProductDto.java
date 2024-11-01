package com.softcoders.order.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductDto {

    private String id;
    private String description;
    private Integer price;
}
