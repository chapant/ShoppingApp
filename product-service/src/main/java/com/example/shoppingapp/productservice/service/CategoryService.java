package com.example.shoppingapp.productservice.service;

import com.example.shoppingapp.productservice.model.Category;

import java.util.List;

public interface CategoryService {
    Category findById(Integer id);
    List<Category> findAll();
    void insert(Category category);
    void update(Category category);
    void delete(Integer id);
}
