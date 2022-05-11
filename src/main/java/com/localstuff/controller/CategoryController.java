package com.localstuff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localstuff.client.entity.CategoryEntity;
import com.localstuff.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/addcat")
	public void postCat(@RequestBody CategoryEntity categoryEntity) {
		this.categoryService.saveCategory(categoryEntity);
	}
	
	@GetMapping("/addcat/{id}")
	public CategoryEntity getCat(@PathVariable int id) {
		CategoryEntity category = this.categoryService.getCategory(id);
		return category;
		
		
	}
}
