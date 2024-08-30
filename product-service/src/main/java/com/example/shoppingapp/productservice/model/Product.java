package com.example.shoppingapp.productservice.model;

import lombok.Data;

@Data
public class Product {
    private Integer product_id;
    private Integer product_cat;
    private Integer product_brand;
    private String product_title;
    private Integer product_price;
    private String product_desc;
    private String product_image;
    private String product_keywords;
}