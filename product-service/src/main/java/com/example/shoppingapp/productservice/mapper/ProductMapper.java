package com.example.shoppingapp.productservice.mapper;

import com.example.shoppingapp.productservice.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();
    Product findById(Integer id);
    int insert(Product product);
    int update(Product product);
    int delete(Integer id);
    List<Product> findProductsByCategoryId(Integer categoryId);
}