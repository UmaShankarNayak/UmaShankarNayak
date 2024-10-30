package com.softcoders.product.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCT_TABLE")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String description;
    private Integer price;
}
