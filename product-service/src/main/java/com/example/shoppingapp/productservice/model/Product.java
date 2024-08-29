package com.example.shoppingapp.productservice.model;

import lombok.Data;

@Data
public class Product {
    private Integer productId;      // Maps to `product_id`
    private Integer productCat;      // Maps to `product_cat`
    private Integer productBrand;    // Maps to `product_brand`
    private String productTitle;     // Maps to `product_title`
    private Integer productPrice;    // Maps to `product_price`
    private String productDesc;      // Maps to `product_desc`
    private String productImage;     // Maps to `product_image`
    private String productKeywords;  // Maps to `product_keywords`
}