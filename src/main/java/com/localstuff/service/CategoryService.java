package com.localstuff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localstuff.client.entity.CategoryEntity;
import com.localstuff.dao.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public void saveCategory(CategoryEntity categoryEntity) {
		this.categoryRepository.save(categoryEntity);
	}

	public void updateCategory(CategoryEntity categoryEntity) {
		this.categoryRepository.saveAndFlush(categoryEntity);
	}

	public CategoryEntity getCategory(int id) {
		return this.categoryRepository.getById(id);
	}

	public void deleteCategory(int id) {
		this.categoryRepository.deleteById(id);
	}

	public List<CategoryEntity> getAllCategory() {
		return this.categoryRepository.findAll();
	}

	public CategoryEntity getByCategoryByName(String category) {
		return this.categoryRepository.findByCategoryName(category);
	}
}
