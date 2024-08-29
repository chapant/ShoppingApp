package com.example.shoppingapp.productservice.controller;

import com.example.shoppingapp.productservice.model.Category;
import com.example.shoppingapp.productservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Integer id) {
        return categoryService.findById(id);
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

    @PostMapping
    public void createCategory(@RequestBody Category category) {
        categoryService.insert(category);
    }

    @PutMapping("/{id}")
    public void updateCategory(@PathVariable Integer id, @RequestBody Category category) {
        category.setCategoryId(id);
        categoryService.update(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        categoryService.delete(id);
    }
}
