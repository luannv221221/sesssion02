package com.ra.service;

import com.ra.model.enity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    void delete(Long id);
}
