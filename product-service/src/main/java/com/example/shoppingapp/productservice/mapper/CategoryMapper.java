package com.example.shoppingapp.productservice.mapper;

import com.example.shoppingapp.productservice.model.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    Category findById(Integer id);
    List<Category> findAll();
    void insert(Category category);
    void update(Category category);
    void delete(Integer id);
}
