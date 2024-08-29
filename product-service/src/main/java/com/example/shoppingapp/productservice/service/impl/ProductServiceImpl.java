package com.example.shoppingapp.productservice.service.impl;

import com.example.shoppingapp.productservice.mapper.ProductMapper;
import com.example.shoppingapp.productservice.model.Product;
import com.example.shoppingapp.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Product findById(Integer id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public void insert(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public void delete(Integer id) {
        productMapper.delete(id);
    }

    @Override
    public List<Product> findProductsByCategoryId(Integer categoryId) {
        return productMapper.findProductsByCategoryId(categoryId);
    }
}
