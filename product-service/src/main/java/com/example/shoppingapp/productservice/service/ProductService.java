package com.example.shoppingapp.productservice.service;

import com.example.shoppingapp.productservice.model.Product;

import java.util.List;

public interface ProductService {
    Product findById(Integer id);
    List<Product> findAll();
    List<Product> findProductsByCategoryId(Integer categoryId);
    void insert(Product product);
    void update(Product product);
    void delete(Integer id);
}
